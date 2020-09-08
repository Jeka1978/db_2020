package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class BenchmarkToggle  implements BenchmarkToggleMBean{
    private boolean enabled;

    @Override
    public void shutDown(int code) {
        System.out.println("code = " + code);
        System.exit(code);
    }
}
