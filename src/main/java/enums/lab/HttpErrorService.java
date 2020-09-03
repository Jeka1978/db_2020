package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class HttpErrorService {
    public void handleText(String body) {


        int index = body.indexOf("http:");
        int httpCode = Integer.parseInt(body.substring(index +5, index+8));

        HttpCodeEnum.findByFirstErrorDigigt(httpCode/100).getHttpCodeErrorHandler().handle(httpCode);
    }

    public static void main(String[] args) {
        HttpErrorService service = new HttpErrorService();
        service.handleText("dajfhalsdkjfhak asdjhgfljaksdgf jgfa http:550 adskfjgsdakjfghad");
    }
}
