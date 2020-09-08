package my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {


        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class,
                Cleaner.class, CleanerImpl.class
                );


        JavaConfig config = new JavaConfig(map, "my_spring");
        ApplicationContext context = new ApplicationContext(config);

        IRobot iRobot = context.getBean(IRobot.class);

        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(3000);
        }


    }
}
