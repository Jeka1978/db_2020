package homework.exams_generation.Operators;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum Operator {
    SUM("+", new SumOperation()),
    SUBTRACTION("-", new SubtractionOperation()),
    MULTIPLICATION("*", new MultiplicationOperation()),
    DIVISION(":", new DivisionOperation());

    private final String sign;
    private final ArithmeticOperation operation;

}
