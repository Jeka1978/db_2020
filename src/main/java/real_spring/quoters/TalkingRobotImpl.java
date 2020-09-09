package real_spring.quoters;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */


public class TalkingRobotImpl implements TalkingRobot {


    @Autowired
    private List<Quoter> quoters;



    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
