package contructor_chaining;

/**
 * @author Evgeny Borisov
 */
public class Parent {

    {
        System.out.println();
    }


    public Parent() {
        init();
        printX();

    }

    protected void init() {

    }

    private void printX() {
        System.out.println("X");
    }
}
