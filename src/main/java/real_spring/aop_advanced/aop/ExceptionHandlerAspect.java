package real_spring.aop_advanced.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import real_spring.aop_advanced.services.DBRuntimeException;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
//@PropertySource("mails_dba.properties")
public class ExceptionHandlerAspect {

//    @Value()

    @AfterThrowing(pointcut = "execution(* real_spring.aop_advanced.*.*(..))", throwing = "ex")
    public void handleDbException(DBRuntimeException ex) {
        System.out.println("sending mails "+ex.getMessage());
    }
}
