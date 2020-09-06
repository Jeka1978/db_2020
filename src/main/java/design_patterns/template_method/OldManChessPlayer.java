package design_patterns.template_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class OldManChessPlayer  {
    public static void main(String[] args) {
        List<? super Number> numbers = new ArrayList<>();

        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.2, 2.2, 3.3);


        numbers.add(1);




        Object o = new Object();
        numbers.add(null);
    }
}
