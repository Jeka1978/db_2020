package real_spring.qualifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static real_spring.qualifiers_example.DBType.MONGO;
import static real_spring.qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {

    @DeutscheRepo(ORACLE)
    private Dao mainDao;

    @DeutscheRepo(MONGO)
    private Dao backupDao;


    @Scheduled(fixedDelay = 1000)
    public void work(){
        System.out.println("working...");
        mainDao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup(){
        System.out.println("backuping...");
        backupDao.saveAll();
    }

}
