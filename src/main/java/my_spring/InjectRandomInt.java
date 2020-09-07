package my_spring;/**
 * @author Evgeny Borisov
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectRandomInt {
    int min() default 5;
    int max() default 10;
}
