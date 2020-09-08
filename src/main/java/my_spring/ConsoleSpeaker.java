package my_spring;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class ConsoleSpeaker implements Speaker {
    @Override
    @Benchmark
    public void speak(String message) {
        System.out.println(message);
    }
}
