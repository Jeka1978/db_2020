package real_spring.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */


@Component
public class TalkingRobotImpl implements TalkingRobot {



    @Autowired
    @Film
    private List<Quoter> quoters = List.of(() -> System.out.println("this is default quote"));


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
