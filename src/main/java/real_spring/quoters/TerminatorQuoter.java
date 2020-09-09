package real_spring.quoters;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;


    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void init() {
        System.out.println("Мне нужна твоя одежду, ботинки и мотоцикл");
    }
}



