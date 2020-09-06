package homework.exams_generation;

import heroes.RandomUtil;
import homework.exams_generation.Examinator.Examinators;
import homework.exams_generation.Examinator.GroupOne;
import homework.exams_generation.Exercises.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateExercise {

    private final Examinators examinators;

    public GenerateExercise(Examinators  config) {
        this.examinators = config;
    }

    public List<Exercise> generate(int maxEx) {

        return Stream.generate(
                () -> RandomUtil.randomItem(examinators.getExerciseGenerators()).generate())
                .limit(maxEx)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        String name ;
        System.out.print("Enter your name: ");
        name = info.nextLine();
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        System.out.println("Welcome " + name + "! Please answer the following questions:" + "\n");

        GenerateExercise ex = new GenerateExercise(new GroupOne());
        List<Exercise> exercises = ex.generate(5);
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }

    }



}