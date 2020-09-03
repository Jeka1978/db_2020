package heroes;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.function.Function;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class ConfigurableHeroFactory implements HeroFactory {
    private Faker faker = new Faker();

    private final HeroesConfig heroesConfig;


    @Override
    public Hero createNewHero() {
        List<Function<String, Hero>> heroCreators = heroesConfig.getHeroCreators();
        return RandomUtil.randomItem(heroCreators).apply(faker.funnyName().name());

    }
}
