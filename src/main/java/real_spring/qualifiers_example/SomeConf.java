package real_spring.qualifiers_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@DeutscheBankConfig
public class SomeConf {


    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SomeConf.class);
    }
}
