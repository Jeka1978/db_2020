package string_games;

import demo.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String("JAVA");

        System.out.println(str.equals(str2));


        List<String> strings = new ArrayList<>();
        List<String> strings2 = new LinkedList<>();

        System.out.println(strings instanceof Collection);

    }
}
