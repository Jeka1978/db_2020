package heroes;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static heroes.RandomUtil.randomItem;

/**
 * @author Evgeny Borisov
 */

public class DynamicReflectionHeroFactory implements HeroFactory {

    private Reflections scanner = new Reflections("heroes");
    private List<Class<? extends Hero>> classes;
    private Faker faker = new Faker();

    public DynamicReflectionHeroFactory() {
        classes = new ArrayList<>(scanner.getSubTypesOf(Hero.class));
    }


    public static void main(String[] args) {
        System.out.println(123);
    }

    @SneakyThrows
    @Override
    public Hero createNewHero() {
        return randomItem(classes).getDeclaredConstructor(String.class).newInstance(faker.gameOfThrones().character());


    }


}
