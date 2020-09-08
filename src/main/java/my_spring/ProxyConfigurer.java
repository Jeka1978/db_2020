package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurer {
    Object wrapWithProxy(ApplicationContext context, Object t, Class<?> implClass);
}
