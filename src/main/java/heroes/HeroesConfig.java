package heroes;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface HeroesConfig {
    List<HeroCreator> getHeroCreators();
}
