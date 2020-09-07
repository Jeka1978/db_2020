package my_spring;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
public class Developer {
    @InjectRandomInt(min = 20,max = -5)
    private int experience;
}
