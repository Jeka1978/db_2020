package animals;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {

    public void treat(Animal animal) {


        int x =12;




        animal.makeVoice();
        if (animal instanceof Dog) {
            ((Dog) animal).bringStick();
        }
    }
}
