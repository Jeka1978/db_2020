package real_spring.aop_advanced.services;

/**
 * @author Evgeny Borisov
 */
public class DBRuntimeException extends RuntimeException {
    public DBRuntimeException(String message) {
        super(message);
    }
}
