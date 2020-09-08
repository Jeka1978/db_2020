package my_spring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import reflections_example.MyTestClass;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactoryTest {


    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ApplicationContext(new JavaConfig(null, "my_spring"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void injectRandomIntForIncorrectValuesIsFailing() {

        context.getBean(Developer.class);
    }

    @Test
    public void injectRandomIntIsWorking() {

        Soldier soldier = context.getBean(Soldier.class);
        Assert.assertTrue(soldier.getPower() < 15 && soldier.getPower() > 7);
    }

    @Test
    public void objectWasCreatedFromConfiguredClass() {

        Config config = Mockito.mock(Config.class);
        Mockito.when(config.getPackageToScan()).thenReturn("my_spring");

        Mockito.when(config.getImpl(SuperHero.class)).then(invocation -> Batman.class);

        ApplicationContext context = new ApplicationContext(config);

        SuperHero superHero = context.getBean(SuperHero.class);
        Assert.assertEquals(Batman.class, superHero.getClass());
    }


    @Test
    public void testSingletonWillBeCreatedOnlyOnce() {
        MySingleton bean1 = context.getBean(MySingleton.class);
        MySingleton bean2 = context.getBean(MySingleton.class);
        context.getBean(MySingleton.class);

        Assert.assertTrue(bean1==bean2);
        Assert.assertEquals(1,MySingleton.counter);


    }
}























