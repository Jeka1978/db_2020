package my_spring;

/**
 * @author Evgeny Borisov
 */
public class RandomNotValidException extends RuntimeException {
    public RandomNotValidException(String message) {
        super(message);
    }
}
