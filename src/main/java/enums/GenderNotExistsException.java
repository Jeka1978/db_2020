package enums;

/**
 * @author Evgeny Borisov
 */
public class GenderNotExistsException extends RuntimeException {
        public GenderNotExistsException(String message) {
        super(message);
    }

    public GenderNotExistsException(Throwable cause) {
        super(cause);
    }
}
