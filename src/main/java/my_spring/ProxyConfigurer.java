package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurer {
    Object replaceWithProxy(ApplicationContext context, Object t, Class<?> implClass);
}
