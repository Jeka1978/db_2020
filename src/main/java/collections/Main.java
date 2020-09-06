package collections;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("tuborg", 12);
        map.put("tuborg", 13);



        System.out.println(map.get("tuborg"));
    }
}
