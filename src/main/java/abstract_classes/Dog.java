package abstract_classes;

/**
 * @author Evgeny Borisov
 */
public class Dog extends Animal {

    public void gavGav() {
        System.out.println("au au");
    }

    @Override
    public void makeVoice() {
        gavGav();
    }
}
