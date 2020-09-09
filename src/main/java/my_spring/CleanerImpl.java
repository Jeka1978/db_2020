package my_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public final class CleanerImpl implements Cleaner {


    @InjectRandomInt(min = 3, max = 10)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {

        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVVVVvvvvvvvvvvvvvvvvvvvv");
        }
    }


    @Benchmark
    public void mishaSpasibo() {
        System.out.println("asdgfhd");
    }

}












