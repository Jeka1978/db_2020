package homework.exams_generation;

import heroes.RandomUtil;

import static homework.exams_generation.Operator.MINUS;

/**
 * @author Evgeny Borisov
 */
public class MinusSecondDegreeExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        int a = RandomUtil.getIntBetween(0, 100);
        int b = RandomUtil.getIntBetween(0, a);
        return Exercise.builder().a(a).b(b).operator(MINUS).answer(a - b).build();


    }
}
