package singleton_anti_pattern;

/**
 * @author Evgeny Borisov
 */
public class ServiceC {

    private static ServiceC myInstance = new ServiceC();

    private ServiceC() {
        System.out.println("настроивает");
    }

    public static ServiceC getInstance() {
        return myInstance;
    }

    public void doWork4(){
        ServiceD.INSTANCE.doWork4();
    }
}
