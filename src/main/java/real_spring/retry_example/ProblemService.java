package real_spring.retry_example;

import heroes.RandomUtil;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ProblemService {



    @Retryable(maxAttempts = 7,backoff =@Backoff(500))
    public void doWork(){
        System.out.println("trying...");

        if (RandomUtil.getIntBetween(0, 2) == 1) {
            throw new IllegalStateException("");
        }
        System.out.println("ура!!!!");
    }
}
