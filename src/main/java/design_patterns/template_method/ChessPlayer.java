package design_patterns.template_method;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public final class ChessPlayer implements Player {

    private String name;
    @Override
    public void makeMove() {
        System.out.println("e2 e4");
    }
}
