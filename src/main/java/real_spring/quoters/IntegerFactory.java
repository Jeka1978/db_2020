package real_spring.quoters;

import heroes.RandomUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Component
@Scope
@Lazy
public class IntegerFactory implements FactoryBean<Integer> {

    private final int min,max;

    public int randomInt(){
        return RandomUtil.getIntBetween(min, max);
    }

    @Override
    public Integer getObject() throws Exception {
        return randomInt();
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
