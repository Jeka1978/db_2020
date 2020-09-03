package heroes;

import lombok.AccessLevel;
import lombok.Setter;

import java.util.List;

import static heroes.RandomUtil.getIntBetween;

/**
 * @author Evgeny Borisov
 */
public class Knight extends Hero {

    @Setter(AccessLevel.PROTECTED)
    private Weapon currentWeapon = new Sword();


//    private List<Weapon> weapons = List.of(new Sword())


    public Knight(String name) {
        super(getIntBetween(2,12), getIntBetween(2,12), name);
    }

    @Override
    public KickResult kick(Hero enemy) {
        return currentWeapon.kick(this,enemy);
    }
}


