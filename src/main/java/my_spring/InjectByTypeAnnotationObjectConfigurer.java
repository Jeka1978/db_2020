package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeAnnotationObjectConfigurer implements ObjectConfigurer {
    @SneakyThrows
    @Override
    public void configure(Object t, ApplicationContext context) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object value = context.getBean(field.getType());
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
