package homework.exams_generation;

import homework.riddle_game.RiddleGame;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GenerateExercise {

    private final int countOfElements;
    private final int randomMax;


    public GenerateExercise(int countOfElements, int randomMax){

        if (countOfElements < 2){

            throw new IllegalStateException("Count of elements can't be less than 2!");

        }

        this.countOfElements = countOfElements;
        this.randomMax = randomMax;

    }


    public String[] generateSum(int countOfExercises){

        return generate(countOfExercises,'+');

    }

    public String[] generateSubtraction(int countOfExercises){

        return generate(countOfExercises,'-');

    }

    public String[] generateMultiplication(int countOfExercises){

        return generate(countOfExercises,'*');

    }

    public String[] generateDivision(int countOfExercises){

        return generate(countOfExercises,':');

    }

    private String[] generate(int countOfExercises, char operator){

        String[] result = new String[countOfExercises];
        Random random = new Random();

        for (int i = 0; i < result.length; i++){

            result[i] = "What is ";

            int maxCountOfElements = random.nextInt(countOfElements - 2) + 2;

            for (int j = 0; j < maxCountOfElements; j++){
                int num = random.nextInt(randomMax);
                result[i] += j == maxCountOfElements-1? num + " = ?" : num + " " + operator + " ";
            }

        }
        return result;

    }

    public static void main(String[] args) {

        int countOfExercises = 3;
        int countOfElements = 5;
        int randomMax = 10;

        GenerateExercise exercise = new GenerateExercise(countOfElements, randomMax);
        String[] ex = exercise.generateSum(countOfExercises);

        for (int i = 0; i < ex.length; i++) {
            System.out.println(ex[i]);
        }

        ex = exercise.generateSubtraction(countOfExercises);

        for (int i = 0; i < ex.length; i++) {
            System.out.println(ex[i]);
        }

        ex = exercise.generateMultiplication(countOfExercises);

        for (int i = 0; i < ex.length; i++) {
            System.out.println(ex[i]);
        }

        ex = exercise.generateDivision(countOfExercises);

        for (int i = 0; i < ex.length; i++) {
            System.out.println(ex[i]);
        }


   /*     Scanner info = new Scanner(System.in);
        String name ;
        System.out.print("Enter your name: ");
        name = info.nextLine();
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        System.out.println("Welcome " + name + "! Please answer the following questions:");
        GenerateExercise exercise = new GenerateExercise();
        exercise.generate(); */

    }

}