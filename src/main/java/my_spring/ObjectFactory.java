package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private ApplicationContext context;

    private List<ObjectConfigurer> objectConfigurers = new ArrayList<>();
    private List<ProxyConfigurer> proxyConfigurers = new ArrayList<>();

    private Reflections scanner;

    @SneakyThrows
    ObjectFactory(ApplicationContext context, Reflections scanner) {
        this.scanner = scanner;
        this.context = context;

        Set<Class<? extends ObjectConfigurer>> classes = scanner.getSubTypesOf(ObjectConfigurer.class);
        for (Class<? extends ObjectConfigurer> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                objectConfigurers.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
        Set<Class<? extends ProxyConfigurer>> classes2 = scanner.getSubTypesOf(ProxyConfigurer.class);
        for (Class<? extends ProxyConfigurer> aClass : classes2) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                proxyConfigurers.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> implClass) {


        T t = create(implClass);

        configure(t);

        invokeInitMethod(implClass, t);


        t = configureProxyIfNeeded(implClass, t);


        return t;
    }

    private <T> T configureProxyIfNeeded(Class<T> implClass, T t) {
        for (ProxyConfigurer proxyConfigurer : proxyConfigurers) {
            t = (T) proxyConfigurer.replaceWithProxy(context, t, implClass);
        }
        return t;
    }


    private <T> void invokeInitMethod(Class<? extends T> implClass, T t) throws IllegalAccessException, InvocationTargetException {
        Set<Method> methods = ReflectionUtils.getAllMethods(implClass);
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);

            }
        }
    }


    private <T> void configure(T t) {
        objectConfigurers.forEach(objectConfigurer -> objectConfigurer.configure(t, context));
    }

    @SneakyThrows
    private <T> T create(Class<? extends T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {

//        Constructor<?> autowiredConstructor = Arrays.stream(implClass.getDeclaredConstructors())
//                .filter(constructor -> constructor.isAnnotationPresent(Autowired.class)).findAny().get();
//        Class<?>[] types = autowiredConstructor.getParameterTypes();
//
//
//
//        Object[] constructorArgs = new Object[types.length];
//
//        for (int i = 0; i < types.length; i++) {
//            Class<?> type = types[i];
//            constructorArgs[i] = context.getBean(type);
//        }
//
//
//        autowiredConstructor.newInstance(constructorArgs);


        return implClass.getDeclaredConstructor().newInstance();
    }


}








