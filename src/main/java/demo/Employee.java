package demo;

/**
 * @author Evgeny Borisov
 */
public class Employee extends Person {
    private int salary;
    public Employee(String name, int age) {
        super(name, age);
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
