package demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class StartTest {

    @Test
    public void main() {
        int x = 3;
        Assert.assertEquals(3,x);
    }
}