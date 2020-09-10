package homework.never_use_switch;

import com.github.javafaker.Faker;
import heroes.RandomUtil;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailMockProducer {

    @Autowired
    private MailDistributor mailDistributor;

    @Autowired
    private Faker faker;

    @Autowired
    private DataFactory dataFactory;


    @Scheduled(fixedDelay = 1000)
    public void sendMailsForever() {

        int mailType = RandomUtil.getIntBetween(0, 3) + 1;
        MailInfo mailInfo = MailInfo.builder()
                .email(dataFactory.getEmailAddress())
                .mailType(mailType)
                .text(faker.chuckNorris().fact()).build();
        mailDistributor.sendMailInfo(mailInfo);


    }


}






