package java_8_examples.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    default void speakToChildren(){
        System.out.println("ДЕТИ ПОШЛИ ОБЕДАТЬ!!!");
    }
}
