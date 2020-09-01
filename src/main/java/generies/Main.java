package generies;

import demo.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {

    private List<String> names;


    public void doX(List<String> list) {

    }


    public static void main(String[] args) throws Exception {


        Field names = Main.class.getDeclaredField("names");

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("vasta", 12));
        persons.add(new Person("vasta", 12));
        persons.add(new Person("vasta", 12));


        Person o =  persons.get(1);


    }
}
