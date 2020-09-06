package reflections_example;

import demo.Person;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class ObjectAnalyzer {
    @SneakyThrows
    public void printMetaData(Object o) {



        Field age = Person.class.getField("age");


        Class<?> c = o.getClass();

//        c.getSuperclass();
//        Method[] declaredMethods = c.getDeclaredMethods();
//        ReflectionUtils.getAllMethods(c);

        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
        }

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

    }

    public static void main(String[] args) {
        Person person = new Person();
        String str;

        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer();
        objectAnalyzer.printMetaData(person);
        System.out.println("**************************");
        objectAnalyzer.printMetaData("jasgdhjkash");
    }

}























