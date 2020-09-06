package enums.lab;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum HttpCodeEnum {

    CLIENT_ERROR(4,new ClientHttpCodeErrorHandler()),
    SERVER_ERROR(5,new ServerHttpCodeErrorHandler()),
    DEFAULT(-1, null);

    private final int firstErrorDigit;
    @Getter
    private final HttpCodeErrorHandler httpCodeErrorHandler;


    public static HttpCodeEnum findByFirstErrorDigigt(int digit) {

        for (HttpCodeEnum httpCodeEnum : values()) {
            if (httpCodeEnum.firstErrorDigit == digit) {
                return httpCodeEnum;
            }
        }
        throw new UnsupportedOperationException(digit + " is not supported");
    }

}
