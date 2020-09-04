package homework.exams_generation;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Operator {
    PLUS("+"),MINUS("-"),MULTIPLY("*"), DIVIDE("/");

    private final String sign;

}
