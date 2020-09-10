package real_spring.aop_advanced;

import homework.never_use_switch.MailConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import real_spring.aop_advanced.services.ServiceA;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        context.getBean(ServiceA.class).doA();
    }

}
