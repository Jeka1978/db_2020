package java_8_examples.multiple_inharitance;

/**
 * @author Evgeny Borisov
 */
public class Child implements Father,Mother {

    @Override
    public void speakToChildren() {
        Father.super.speakToChildren();
        Mother.super.speakToChildren();
    }
}
