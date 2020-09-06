package abstract_classes;

import demo.Bird;
import demo.Flyable;

/**
 * @author Evgeny Borisov
 */
public class Eagle extends Animal implements Flyable, Comparable<Eagle> {

    {
        System.out.println(123);


    }

    public Eagle() {
    }

    public Eagle(String name) {
        this.name = name;
    }



    @Override
    public void makeVoice() {
        System.out.println("tzvi tzvi");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public int compareTo(Eagle eagle) {
        if (this.power > eagle.power) {
            return 10;
        }
        throw new IllegalStateException("haha");
    }
}
