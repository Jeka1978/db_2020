package my_spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class MainDemoForProxy {
    public static void main(String[] args) {



    }


    public Object replaceWithProxy(Object object) {
        Class<?> aClass = object.getClass();
        if (aClass.isAnnotationPresent(Benchmark.class) || Arrays.stream(aClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), aClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    long start = System.nanoTime();
                    Object retVal = method.invoke(object, args);
                    long end = System.nanoTime();
                    System.out.println(end-start);


                    return retVal;
                }
            });
        }else {
            return object;
        }
    }

}
