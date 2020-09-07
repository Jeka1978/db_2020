package my_spring;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
public class Soldier {
    @InjectRandomInt(min = 10,max = 15)
    private int power;
}
