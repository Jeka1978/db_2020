package my_spring.demo;

import my_spring.Singleton;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class AnotherService {
    // if transaction already opened - not additional transactions will happen
    @Transactional
    public void save(String datum) {
        System.out.println("datum = " + datum);
    }
}
