package real_spring.quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Book
@Film
@Primary
public class ConanDoyleQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Это элементарно");
    }
}
