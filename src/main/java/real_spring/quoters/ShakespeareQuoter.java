package real_spring.quoters;

import lombok.Setter;
import my_spring.InjectRandomInt;

/**
 * @author Evgeny Borisov
 */

public class ShakespeareQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 4,max = 7)
    private int repeat;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

}


