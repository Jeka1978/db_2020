package homework.exams_generation;

import heroes.RandomUtil;

/**
 * @author Evgeny Borisov
 */
public class MultiplySecondDegreeExerciseGenerator implements ExerciseGenerator {
    private ExerciseGeneratorAssistant assistant = new StandardExerciseGeneratorAssistant(0, 10);
    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperator(Operator.MULTIPLY);
        exercise.setAnswer(exercise.getA()*exercise.getB());
        return exercise;
    }
}
