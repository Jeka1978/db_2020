package work_with_file_system;

import demo.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {

    public static void main(String[] args) throws IOException {
        File file = new File("c:/tmp/person.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();


        Person person = new Person("Lena", 20);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();


        System.out.println("the end");
    }
}
