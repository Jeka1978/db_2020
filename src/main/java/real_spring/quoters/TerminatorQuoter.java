package real_spring.quoters;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */


public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;



    @Autowired
    public void setWords(@Value("${terminator}") String[] words) {
        this.messages = Arrays.asList(words);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PostConstruct
    public void init() {
        System.out.println("Мне нужна твоя одежду, ботинки и мотоцикл");
    }


    @PreDestroy
    public void killAll() {
        System.out.println("you are terminated...");
    }


}



