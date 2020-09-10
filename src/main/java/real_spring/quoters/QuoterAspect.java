package real_spring.quoters;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {


    //    @AfterReturning
    //    @AfterThrowing
    //    @After
    //@Before
    @Around("execution(* real_spring.quoters..*.say*(..))")
    public Object beforeSayMethods(ProceedingJoinPoint jp) throws Throwable {
        System.out.print(jp.getTarget().getClass().getSimpleName() + " обычно говорил в таких случаях: ");
        Object retVal = jp.proceed();
        System.out.println("sjdashdk");
        return retVal;
    }


}









