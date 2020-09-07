package singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class ServiceB {

    private static ServiceB myInstance = new ServiceB();

    private ServiceB() {


    }

    public static ServiceB getInstance() {
        return myInstance;
    }

    public void doWork2(){
        ServiceC.getInstance().doWork4();
    }
}
