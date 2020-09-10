package real_spring.qualifiers_example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import static real_spring.qualifiers_example.DBType.MONGO;

/**
 * @author Evgeny Borisov
 */

@DeutscheRepo(MONGO)
public class BackupDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saving to Mongo");
    }
}
