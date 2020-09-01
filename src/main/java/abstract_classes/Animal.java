package abstract_classes;

/**
 * @author Evgeny Borisov
 */

public abstract class Animal {

   protected int hp;
   protected int power;
   protected String name;

    public void breathe(){
        System.out.println("я дышу, а значит я живу");
    }

    public abstract void makeVoice();

}
