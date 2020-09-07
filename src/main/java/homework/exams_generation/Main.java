package homework.exams_generation;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        Examinator examinator = new Examinator(List.of(
                new SummarySecondDegreeExerciseGenerator(),
                new MinusSecondDegreeExerciseGenerator(),
                new MultiplySecondDegreeExerciseGenerator()

        ));
        List<Exercise> exercises = examinator.generate(20);
        exercises.forEach(System.out::println);
    }
}
