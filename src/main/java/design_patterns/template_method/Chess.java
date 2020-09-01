package design_patterns.template_method;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Chess extends AbstractGame<ChessPlayer> {


    private Random random = new Random();
    ;

    public Chess(ChessPlayer player1, ChessPlayer player2) {
        super(player1, player2);
    }

    @Override
    protected boolean endOfGame() {
        return random.nextInt(50) == 2;
    }

    @Override
    protected List<Pair> calcBestScores() {
        return List.of(new Pair("Vasyliy 2",40));
    }

    @Override
    protected void prepareBoard() {
        System.out.println("preparing");
    }
}
