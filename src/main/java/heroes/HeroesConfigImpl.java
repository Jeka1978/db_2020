package heroes;

import lombok.Getter;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class HeroesConfigImpl implements HeroesConfig {
    @Getter
    private List<HeroCreator> heroCreators =
            List.of(
                    Elf::new,
                    King::new,
                    Hobbit::new,
                    Knight::new

            );
}
