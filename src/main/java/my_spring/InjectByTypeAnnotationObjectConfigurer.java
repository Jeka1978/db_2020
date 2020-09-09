package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        Method[] methods = t.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(InjectByType.class)) {
                Object bean = context.getBean(method.getParameterTypes()[0]);
                method.invoke(t, bean);
            }
        }

    }




}
