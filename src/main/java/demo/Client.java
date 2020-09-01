package demo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Client extends Person {

    @Setter
    @Getter
    private String preferences;


    public Client(String name, int age) {
        super(name, age);
    }


    @Override
    public void printDetails() {


        if (true) {
            System.out.println("true");
        }


        super.printDetails();
        System.out.println("preferences = " + preferences);
    }
}
