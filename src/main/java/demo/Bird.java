package demo;

/**
 * @author Evgeny Borisov
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
}
