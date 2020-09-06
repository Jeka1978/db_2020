package design_patterns;

import design_patterns.template_method.Chess;
import design_patterns.template_method.ChessPlayer;
import design_patterns.template_method.Football;
import design_patterns.template_method.Game;

/**
 * @author Evgeny Borisov
 */
public class Z {
    public static void main(String[] args) {
        ChessPlayer john = new ChessPlayer("John");
        ChessPlayer james = new ChessPlayer("James");

        Game game = new Chess(john, james);
        game = new Football();

        game.play();
    }
}
