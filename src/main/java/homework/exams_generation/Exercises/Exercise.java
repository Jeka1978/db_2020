package homework.exams_generation.Exercises;

import homework.exams_generation.Operators.Operator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private int num1;
    private int num2;
    private Operator operator;

    @Override
    public String toString() {
        return num1 + " " + operator.getSign() + " " + num2 + " = " ;
    }

}
