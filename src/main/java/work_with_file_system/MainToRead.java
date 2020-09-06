package work_with_file_system;

import demo.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {

    public static void main(String[] args) throws Exception {
        File file = new File("c:/tmp/person.obj");

        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Person person = (Person) oos.readObject();

        person.printDetails();
        System.out.println(Person.counter);

        String s = new String("java");

        System.out.println("the end");

        Class<?> aClass = Class.forName("java.lang.String");

        Constructor<Person> constructor = Person.class.getDeclaredConstructor();
        Person person1 = constructor.newInstance();
        person1.printDetails();

//        Constructor<?> constructor = aClass.getConstructor(String.class);
//        String str = (String) constructor.newInstance("java");
//        System.out.println(str);
    }
}
