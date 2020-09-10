package homework.never_use_switch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackSender implements MailSender {

    @Value("${email_callback.message}")
    private String message;

    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println(message);
    }

    @Override
    public int myCode() {
        return 2;
    }
}
