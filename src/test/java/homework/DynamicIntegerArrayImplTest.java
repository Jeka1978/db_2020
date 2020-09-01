package homework;

import org.junit.Assert;
import org.junit.Test;

import static contstants.SystemConst.SYSTEM_NAME;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class DynamicIntegerArrayImplTest {

    @Test
    public void getAndAddTest() {
        DynamicIntegerArrayImpl array = new DynamicIntegerArrayImpl();
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertEquals(1,array.get(0));
        Assert.assertEquals(2,array.get(1));
        Assert.assertEquals(3,array.get(2));
        System.out.println(SYSTEM_NAME);

    }
}