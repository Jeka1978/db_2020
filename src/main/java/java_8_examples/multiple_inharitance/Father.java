package java_8_examples.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void speakToChildren(){
       System.out.println("Дети пошли обедать");
   }
}
