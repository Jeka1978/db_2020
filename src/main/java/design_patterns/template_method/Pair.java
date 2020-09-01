package design_patterns.template_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair {
    private String name;
    private int score;
}
