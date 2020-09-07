package singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class ServiceA {

    private static ServiceA myInstance = new ServiceA();

    private ServiceA() {
    }

    public static ServiceA getInstance() {
        return myInstance;
    }

    public void doWork(){
        System.out.println("starting..");
        ServiceB.getInstance().doWork2();
    }
}
