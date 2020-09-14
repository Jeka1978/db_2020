package real_spring.aop_advanced.aop;

import demo.Person;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import real_spring.aop_advanced.services.DBRuntimeException;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
//@PropertySource("mails_dba.properties")
public class ExceptionHandlerAspect {

//    @Value()





    private WeakReference<Person> p = new WeakReference<Person>(new Person());

    private Map<DBRuntimeException, Void> cache = new WeakHashMap<>();


    @Pointcut("@target(org.springframework.stereotype.Repository))")
    public void repositoryBeans(){}




    @AfterThrowing(pointcut = "execution(* real_spring.aop_advanced..*.*(..))", throwing = "ex")
    public void handleDbException(DBRuntimeException ex) {


        if (!cache.containsKey(ex)) {
            cache.put(ex, null);
            System.out.println("sending mails "+ex.getMessage());
        }

    }
}








