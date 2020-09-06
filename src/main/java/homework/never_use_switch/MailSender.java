package homework.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public interface MailSender {
    void sendMail(MailInfo mailInfo);
    int myCode();
}
