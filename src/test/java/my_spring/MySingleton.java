package my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class MySingleton {
    public static int counter;

    public MySingleton() {
        counter++;
    }
}
