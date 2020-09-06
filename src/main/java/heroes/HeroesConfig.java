package heroes;

import java.util.List;
import java.util.function.Function;

/**
 * @author Evgeny Borisov
 */
public interface HeroesConfig {
    List<Function<String,Hero>> getHeroCreators();
}
