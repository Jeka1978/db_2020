package garabage_collector;

import demo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        StringBuilder str = new StringBuilder("java" + "scala" + "8" + " ");


        for (String arg : args) {
            str.append(arg);
        }



        List<Person> people = new ArrayList<>();
        while (true) {
            Person person = new Person();
            Random random = new Random();
            int i = random.nextInt(1000);
            if (i == 400) {
                people.add(person);
            }
        }
    }
}
