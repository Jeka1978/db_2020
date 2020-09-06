package heroes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static heroes.RandomUtil.getIntBetween;

/**
 * @author Evgeny Borisov
 */
public class King extends Hero {

    @Setter(AccessLevel.PROTECTED)
    private Weapon currentWeapon = new Sword();



    public King(String name) {
        super(getIntBetween(5,15), getIntBetween(5,15), name);
    }

    @Override
    public KickResult kick(Hero enemy) {
        return currentWeapon.kick(this,enemy);
    }
}


