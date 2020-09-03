package enums.lab;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ServerHttpCodeErrorHandler implements HttpCodeErrorHandler {

    @Override
    public void handle(int httpCode) {
        System.out.println("server was restarted");
    }
}
