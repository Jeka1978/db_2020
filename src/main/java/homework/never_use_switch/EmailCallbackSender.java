package homework.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class EmailCallbackSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("don't call us we call you");
    }

    @Override
    public int myCode() {
        return 2;
    }
}
