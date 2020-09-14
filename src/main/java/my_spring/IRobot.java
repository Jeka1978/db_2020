package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public class IRobot {


    private DBankService dBankService;

    @InjectRandomInt(max = 10, min = 1)
    private int version;

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;


    @PostConstruct
    public void init() {
        dBankService.drinkBeer();
        System.out.println("version = " + version);

    }

    private void doX() {
        System.out.println("XXXXXXXXXXXx");
    }


    public void cleanRoom() {
        speaker.speak("Я начал уборку");
        cleaner.clean();
        speaker.speak("Я закончил уборку");
    }
}








