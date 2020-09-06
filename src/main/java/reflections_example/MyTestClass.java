package reflections_example;

/**
 * @author Evgeny Borisov
 */
public class MyTestClass {



    private String testName;

    public MyTestClass() {

        System.out.println("test was created");
    }

    @RunThisMethod
    public  void testMe2() {
        System.out.println("22222222222222");
        System.out.println("testName = " + testName);
    }
    public  void testMe() {
        System.out.println("00000000000000");
    }

    public static void work() {
        System.out.println("666666666666666666");
    }


    public static void main(String[] args) {
        TestRunner.runAllTestMethods("reflections_example.MyTestClass");
    }
}
