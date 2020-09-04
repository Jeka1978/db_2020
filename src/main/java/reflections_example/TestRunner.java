package reflections_example;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Evgeny Borisov
 */

public class TestRunner {

    private int x;
    @SneakyThrows
    public static void runAllTestMethods(String className) {
        Class<?> c = Class.forName(className);
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunThisMethod.class)&& !Modifier.isStatic(method.getModifiers())) {

                Object testInstance = c.getDeclaredConstructor().newInstance();

                Field field = c.getDeclaredField("testName");
                field.setAccessible(true);
                field.set(testInstance,"Пошли обедать");

                method.invoke(testInstance);
            }
        }
    }
}
