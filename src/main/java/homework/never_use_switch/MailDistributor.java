package homework.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {


    public void sendMailInfo(MailInfo mailInfo) {
        switch (mailInfo.getMailType()) {
            case 1:
                // 60 lines of code which will send WELCOME mail
                System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
                break;
            case 2:
                // 80 lines of code which will send WELCOME mail
                System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
            case 3:
               // todo for Leno4ka send mail Happy Birthday
                break;
            default:// throw unsupported
        }
    }
}
