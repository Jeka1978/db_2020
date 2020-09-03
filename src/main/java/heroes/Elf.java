package heroes;

import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
public class Elf extends Hero {



    public Elf(String name) {
        super(10, 10, name);
    }


    @Override
    public KickResult kick(Hero enemy) {
        if (this.getPower() > enemy.getPower()) {
            enemy.setHp(0);
            return new KickResult(enemy.getName() + " was killed by " + this.getName());
        } else {
            enemy.decreasePower(1);
            return new KickResult("now you are weaker");
        }
    }
}
