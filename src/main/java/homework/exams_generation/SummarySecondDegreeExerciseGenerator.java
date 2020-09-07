package homework.exams_generation;

/**
 * @author Evgeny Borisov
 */
public class SummarySecondDegreeExerciseGenerator implements ExerciseGenerator {
    private ExerciseGeneratorAssistant assistant = new StandardExerciseGeneratorAssistant(0, 1000);
    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperator(Operator.PLUS);
        exercise.setAnswer(exercise.getA()+exercise.getB());
        return exercise;
    }
}
