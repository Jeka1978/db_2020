package lab0;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class InsuranceServiceTest {


    @Test(expected = IllegalStateException.class)
    public void testThatAgeCannotBeZero() {
        InsuranceService.builder().build();
    }

    @Test
    public void calcPayment() {


        InsuranceService insuranceService = InsuranceService.builder()
                .driverAge(6)
                .driverExperience(5)
                .loyalty(32)
                .numberOfAccidence(6)
                .build();


        int answer = insuranceService.calcPayment();
        Assert.assertEquals(5, answer);


    }
}