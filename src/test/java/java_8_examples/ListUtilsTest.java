package java_8_examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {

        List<String> list = List.of("java", "JAVA", "scala", "groovy");
        Assert.assertEquals(2, ListUtils.countDuplicates(list,"java"));// todd make it to take lamda which will explain how to compare if obects are equals
    }
}