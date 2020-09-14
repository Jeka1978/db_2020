package real_spring.context_listener;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableRetry
public class SomeConf {

}
