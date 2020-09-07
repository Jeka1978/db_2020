package my_spring;

import heroes.RandomUtil;
import lombok.Setter;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {



    private static ObjectFactory objectFactory = new ObjectFactory();
    @Setter
    private Config config;

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        Class<? extends T> implClass;
        if (type.isInterface()) {
            implClass = config.getImpl(type);
        }else {
            implClass = type;
        }
        T t = implClass.getDeclaredConstructor().newInstance();

        Field[] fields = implClass.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int randomInt = RandomUtil.getIntBetween(annotation.min(), annotation.max());
                field.setAccessible(true);
                field.setInt(t,randomInt);
            }
        }


        return t;


        //todo finish this
        // if type is concrete class, just create and return it's instance
        //if type is and interface, you should find appropriative impl.
    }
}








