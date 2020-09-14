package real_spring.context_listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Evgeny Borisov
 */
public class MtListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ConfigurableListableBeanFactory factory;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

//        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            BeanDefinition beanDefinition = factory.getBeanDefinition(beanDefinitionName);
//
//        }
//        ApplicationContext context = event.getApplicationContext();
//        context.getBean()
    }
}
