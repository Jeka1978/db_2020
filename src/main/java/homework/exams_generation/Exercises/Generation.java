package homework.exams_generation.Exercises;

import heroes.RandomUtil;
import homework.exams_generation.Operators.Operator;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;


@AllArgsConstructor
public class Generation implements ExerciseGenerator {

    private int min;
    private int max;
    private List<Operator> newOperator = Arrays.asList(Operator.values());


    public Generation(int min, int max) {
        this.min = min;
        this.max = max;
    }



    public Exercise generate() {

        Operator operator = RandomUtil.randomItem(newOperator);
        int num1 = RandomUtil.getIntBetween(min, max);
        int num2 = RandomUtil.getIntBetween(min, max);


        return Exercise.builder()
                .num1(num1)
                .num2(num2)
                .operator(operator)
                .build();
    }

}
