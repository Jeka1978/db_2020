package java_8_examples;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t, T t1);

    boolean equals(Object t);

    String toString();


    default void c() {
        a();
    }

    private void a() {
        System.out.println(123);
    }

    static void b() {
    }


    public static Equalator<String> stringEqulasIgnoreCaseEqualator(boolean ignore) {
        if (ignore) {

            return String::equalsIgnoreCase;
        }else {
            return String::equals;
        }
    }


}
