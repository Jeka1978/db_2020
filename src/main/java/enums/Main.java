package enums;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person vasya = new Person("Vasya", Gender.MALE);
        Person lena = new Person("Lena", Gender.FEMALE);
        lena.setGender(null);
        Gender gender = Gender.findByDbCode(13);





        System.out.println(lena.getGender()==vasya.getGender());

        System.out.println(lena.getGender());

        Person person = new Person("John Snow", gender);


        printGenderDesc(person);

    }

    private static void printGenderDesc(Person person) {
        System.out.println(person.getGender().getRussDescription());
    }
}
