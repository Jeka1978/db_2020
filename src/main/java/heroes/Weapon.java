package heroes;

/**
 * @author Evgeny Borisov
 */
public interface Weapon {
    KickResult kick(Hero attacker, Hero defender);
}
