package contructor_chaining;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {

    public final int x = 42;

    private List<String> list;


    public Son() {
        printX();
    }


    @Override
    protected void init() {
        list = new ArrayList<>();

    }

    public void printX() {
        list.add("asdas");
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.printX();


    }

}
