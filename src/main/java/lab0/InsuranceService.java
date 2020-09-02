package lab0;

/**
 * @author Evgeny Borisov
 */
public class InsuranceService {

    private final int driverAge;
    private final int driverExperience;
    private final int numberOfAccidence;
    private final int loyalty;


    private InsuranceService(int driverAge, int driverExperience, int numberOfAccidence, int loyalty) {
        this.driverAge = driverAge;
        this.loyalty = loyalty;
        this.driverExperience = driverExperience;
        this.numberOfAccidence = numberOfAccidence;
    }

    public int calcPayment() {
        return driverAge * driverExperience / numberOfAccidence;
    }

    public static Builder builder(){
        return new Builder();
    }


    public static class Builder {
        private int driverAge;
        private int driverExperience;
        private int numberOfAccidence;
        private int loyalty;

        public Builder driverAge(int driverAge) {
            this.driverAge = driverAge;
            return this;
        }

        public Builder driverExperience(int driverExperience) {
            this.driverExperience = driverExperience;
            return this;
        }

        public Builder numberOfAccidence(int numberOfAccidence) {
            this.numberOfAccidence = numberOfAccidence;
            return this;
        }

        public Builder loyalty(int loyalty) {
            this.loyalty = loyalty;
            return this;
        }

        public InsuranceService build(){
            validate();
            return new InsuranceService(driverAge, driverExperience, numberOfAccidence, loyalty);
        }

        private void validate() {
            if (driverAge == 0) {
                throw new IllegalStateException("driver age is 0");
            }
        }


    }


}















