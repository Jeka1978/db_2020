package abstract_classes.inheritance_anti_pattern.good_house;

import abstract_classes.inheritance_anti_pattern.IsraelBoiler;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        IsraelBoiler boiler = new IsraelBoiler();
        boiler.light();
        boiler.boilWater();
        boiler.setTemperature(100);
        boiler.giveWater();
    }
}
