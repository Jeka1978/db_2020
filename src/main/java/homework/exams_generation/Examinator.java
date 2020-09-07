package homework.exams_generation;

import heroes.RandomUtil;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class Examinator {

    private final List<ExerciseGenerator> exerciseGenerators;

    public List<Exercise> generate(int amount) {


            System.out.println();

        List<Exercise> exercises = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            exercises.add(RandomUtil.randomItem(exerciseGenerators).generate());
        }

        return exercises;
    }
}
