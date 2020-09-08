package my_spring.demo;

import my_spring.InjectByType;
import my_spring.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class BankService {

    @InjectByType
    private AnotherService saveService;


    @InjectByType
    private BankService myOwnProxy;


    public void start() {
        List<String> data = getData();
        processData(data);

        myOwnProxy.save(data);

    }


    @Transactional
    public void save(List<String> data) {

        for (String datum : data) {
            saveService.save(datum);
        }
    }

    private void processData(List<String> data) {

    }

    private List<String> getData() {
        return List.of("data", "data2", "data2"); // 1000 data objects
    }

}
