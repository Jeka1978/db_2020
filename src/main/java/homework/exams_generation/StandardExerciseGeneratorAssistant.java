package homework.exams_generation;

import heroes.RandomUtil;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class StandardExerciseGeneratorAssistant implements ExerciseGeneratorAssistant {

    private final int min;
    private final int max;

    @Override
    public Exercise generateTemplate() {
        int a = RandomUtil.getIntBetween(min, max);
        int b = RandomUtil.getIntBetween(min, max);
        return Exercise.builder().a(a).b(b).build();
    }
}
