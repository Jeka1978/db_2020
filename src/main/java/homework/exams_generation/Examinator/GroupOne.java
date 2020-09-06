package homework.exams_generation.Examinator;

import homework.exams_generation.Exercises.ExerciseGenerator;
import homework.exams_generation.Exercises.Generation;
import homework.exams_generation.Operators.Operator;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class GroupOne implements Examinators{

    private final List<ExerciseGenerator> exerciseGenerators =

            Arrays.asList(new Generation(1, 20 ,
                    List.of(Operator.SUM, Operator.SUBTRACTION,Operator.MULTIPLICATION, Operator.DIVISION)));

}
