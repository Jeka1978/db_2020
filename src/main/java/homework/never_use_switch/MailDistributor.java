package homework.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */

public class MailDistributor {

    private Map<Integer,MailSender> mailSenderMap = new HashMap<>();


    @SneakyThrows
    public MailDistributor() {
        Reflections scanner = new Reflections("homework.never_use_switch");
        Set<Class<? extends MailSender>> classes = scanner.getSubTypesOf(MailSender.class);
        for (Class<? extends MailSender> aClass : classes) {
            MailSender mailSender = aClass.getDeclaredConstructor().newInstance();
            if (mailSenderMap.containsKey(mailSender.myCode())) {
                throw new IllegalStateException(mailSender.myCode() + " already exists");
            }
            mailSenderMap.put(mailSender.myCode(), mailSender);
        }
    }

    public void sendMailInfo(MailInfo mailInfo) {

        MailSender mailSender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        mailSender.sendMail(mailInfo);
    }
}











