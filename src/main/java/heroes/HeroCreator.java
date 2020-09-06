package heroes;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface HeroCreator {
    Hero create(String name);


}
