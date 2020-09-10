package real_spring.quoters;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {


//    @AfterThrowing

    @Around("execution(* real_spring.quoters..*.say*(..))")
    public Object beforeSayMethods(ProceedingJoinPoint jp) throws Throwable {
        System.out.print(jp.getTarget().getClass().getSimpleName()+" обычно говорил в таких случаях: ");
        Object retVal = jp.proceed();
        System.out.println("sjdashdk");
        return retVal;
    }




}









