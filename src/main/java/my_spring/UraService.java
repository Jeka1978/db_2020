package my_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.xml.validation.Validator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class UraService {



    @Benchmark
    @PostConstruct
    public void init(){
        System.out.println(123);
    }


    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(new JavaConfig(Map.of(), "my_spring"));
        context.getBean(UraService.class).init();
    }
}
