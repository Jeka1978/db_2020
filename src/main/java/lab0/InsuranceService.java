package lab0;

/**
 * @author Evgeny Borisov
 */
public class InsuranceService {

    private int driverAge,driverExperience,numberOfAccidence;


    public int calcPayment(){
        return driverAge*driverExperience/numberOfAccidence;
    }
}
