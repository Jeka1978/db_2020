package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Config {
    <T> Class<? extends T> getImpl(Class<T> type);
}
