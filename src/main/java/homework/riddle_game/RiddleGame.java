package homework.riddle_game;

import design_patterns.template_method.Game;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo

    private final int maxLimit;

    public RiddleGame(int max) {
        this.maxLimit = max;

    }

    public static void main(String[] args) {

        int s = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        System.out.println(s);
    }





    @Override
    public void play() {

    }
}





