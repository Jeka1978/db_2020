package lombok_examples;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Human {
    private String name;
    private int age;
    @NonNull
    private Integer salary;
    @Singular
    private Map<String,Integer> beers;

    @Singular
    private List<String> children;

    @Singular("однаРыба")
    private Set<String> fish;
}
