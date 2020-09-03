package heroes;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public KickResult kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.getIntBetween(0, attacker.getPower());
        defender.decreaseHp(damage);
        return new KickResult("sword damage was " + damage);
    }
}
