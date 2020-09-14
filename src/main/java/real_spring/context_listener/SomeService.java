package real_spring.context_listener;

import org.springframework.retry.annotation.Retryable;

/**
 * @author Evgeny Borisov
 */
public interface SomeService {
    @PostProxyConstruct
    @Retryable
    void abc();
}
