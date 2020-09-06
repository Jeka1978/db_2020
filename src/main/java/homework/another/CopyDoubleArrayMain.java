package homework.another;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */
public class CopyDoubleArrayMain {




    public static void main(String[] args) {

        sqrt(2);
        sin(30);
        cos(1);
        pow(3, 2);

        double[] doubles = {2.5, 73.1, 42};
        int[] ints = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            ints[i] = (int) doubles[i];
        }

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}
