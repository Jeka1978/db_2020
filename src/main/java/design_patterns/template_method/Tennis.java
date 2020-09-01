package design_patterns.template_method;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Tennis extends AbstractGame<TennisPlayer> {
    public Tennis(TennisPlayer player1, TennisPlayer player2) {
        super(player1, player2);
    }

    @Override
    protected boolean endOfGame() {
        return false;
    }

    @Override
    protected List<Pair> calcBestScores() {
        return null;
    }

    @Override
    protected void prepareBoard() {

    }
}
