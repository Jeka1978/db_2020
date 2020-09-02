package animals;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("gav gav");
    }

    public void bringStick(){
        System.out.println("Вот твоя палка, держи!");
    }
}
