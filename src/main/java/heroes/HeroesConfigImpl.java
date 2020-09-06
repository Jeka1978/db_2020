package heroes;

import lombok.Getter;

import java.util.List;
import java.util.function.Function;

/**
 * @author Evgeny Borisov
 */
public class HeroesConfigImpl implements HeroesConfig {
    @Getter
    private List<Function<String,Hero>> heroCreators =
            List.of(
                    Elf::new,
                    King::new,
                    Hobbit::new,
                    Knight::new

            );
}
