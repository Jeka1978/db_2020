package heroes;

import lombok.Getter;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class HeroesConfigImpl implements HeroesConfig {
    static String str = "hello ";
    @Getter
    private List<Function<String, Hero>> heroCreators =
            List.of(
                    Elf::new,
                    King::new,
                    Hobbit::new,
                    Knight::new

            );


    public static void main(String[] args) {
        str = "hello";
        Supplier<String> s1 = str::toUpperCase;
        Supplier<String> s2 = () -> str.toUpperCase();
        str = "Hotel Echo Lima Lima Oscar ";
        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println();
    }
}
