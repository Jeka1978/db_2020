package demo;

import lombok.Builder;

/**
 * @author Evgeny Borisov
 */
@Builder
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

//
//    @Override
//    public void printDetails() {
//        super.printDetails();
//        System.out.println("I'm employee");
//        super.printDetails();
//
//        Person person = (Person) this;
//
//    }

    public static void main(String[] args) {
        Employee employee = new Employee("Lena", 18);
        employee.printDetails();
    }
}
