package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class ClientHttpCodeErrorHandler implements HttpCodeErrorHandler {
    @Override
    public void handle(int httpCode) {
        System.out.println("sms to client was send, that his mail is invalid");
    }
}
