package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    private BenchmarkToggle toggle = new BenchmarkToggle();

    @SneakyThrows
    public BenchmarkProxyConfigurer() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(toggle, new ObjectName("my_mbeans", "name", "benchmark"));
    }


    @Override
    public Object wrapWithProxy(ApplicationContext context, Object t, Class<?> implClass) {
        if (implClass.isAnnotationPresent(Benchmark.class) ||
                ReflectionUtils.getAllMethods(implClass).stream().anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            if (implClass.getInterfaces().length != 0) {
                return Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), (proxy, method, args) -> getInvocationHandler(t, implClass, method, args));
            } else {
                return Enhancer.create(implClass, (InvocationHandler) (proxy, method, args) -> {

                    return getInvocationHandler(t, implClass, method, args);
                });
            }

        } else {
            return t;
        }
    }

    private Object getInvocationHandler(Object t, Class<?> implClass, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (toggle.isEnabled() && (implClass.isAnnotationPresent(Benchmark.class) || implClass.getMethod(method.getName(), method.getParameterTypes()).isAnnotationPresent(Benchmark.class))) {
            System.out.println("************* BENCHMARK STARTED for method " + method.getName() + " ****************");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("************* BENCHMARK ENDED for method " + method.getName() + " ****************");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
