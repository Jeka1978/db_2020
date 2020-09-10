package real_spring.quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "real_spring")
public class QuoterConfig {
}
