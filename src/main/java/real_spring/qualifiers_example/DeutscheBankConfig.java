package real_spring.qualifiers_example;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Configuration
@ComponentScan
@EnableScheduling
public @interface DeutscheBankConfig {
}
