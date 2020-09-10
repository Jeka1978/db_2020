package homework.never_use_switch;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Service
public class MailDistributor {

    private Map<Integer, MailSender> mailSenderMap = new HashMap<>();

    public MailDistributor(List<MailSender> list) {

//        mailSenderMap = list.stream().collect(Collectors.toMap(MailSender::myCode, Function.identity()));

        for (MailSender mailSender : list) {
            mailSenderMap.put(mailSender.myCode(), mailSender);
        }

    }

    public void sendMailInfo(MailInfo mailInfo) {

        MailSender mailSender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        mailSender.sendMail(mailInfo);
    }
}











