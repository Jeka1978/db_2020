package homework.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class DefaultMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        throw new UnsupportedOperationException(mailInfo.getMailType() + " not supported yet");
    }

    @Override
    public int myCode() {
        return 0;
    }
}
