package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface BenchmarkToggleMBean {
    boolean isEnabled();

    void setEnabled(boolean enabled);

    void shutDown(int code);
}
