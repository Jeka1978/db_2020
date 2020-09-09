package my_spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * @author Evgeny Borisov
 */
public class BeanDefinitionValidatorBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] names = beanFactory.getBeanDefinitionNames();
        System.out.println("names.length = " + names.length);
        for (String name : names) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(name);
            if (beanDefinition.getDestroyMethodName() != null && beanDefinition.isPrototype()) {
                throw new IllegalStateException("Ты Дибил!");
            }
        }
    }
}
