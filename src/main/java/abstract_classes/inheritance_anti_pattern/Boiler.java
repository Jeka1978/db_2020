package abstract_classes.inheritance_anti_pattern;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */

public class Boiler {

    @Setter
    private int temperature;

    public void boilWater() {
        while (temperature < 40) {
            temperature+=1;
        }
    }



    public void giveWater() {
        if (temperature < 50) {
            System.out.println("я отлично помылся");
        }else {
            System.out.println("я сварился");
        }
    }
}
