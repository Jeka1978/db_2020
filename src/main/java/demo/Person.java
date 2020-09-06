package demo;

import lombok.ToString;

import java.io.Serializable;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */


@ToString(exclude = "age")
public class Person implements Serializable {

    public static int counter;


    private String name;
    public transient int age =7;


    public Person() {
        Random random = new Random();
        int i = random.nextInt(1000);
        if (i == 500) {
            System.out.println("empty constructor");
        }

    }

    public Person(String name, int age) {
        System.out.println("constr not empty");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }



    public void printDetails() {

        // it brakes two main OOP rules
        // 1. Single responsibility
        // 2. Open Close Principle


        /*if (this instanceof Employee) {
            Employee employee = (Employee) this;
            System.out.println(employee.getSalary());
        }
        if (this instanceof Client) {
            Employee employee = (Employee) this;
            System.out.println(employee.getSalary());
        }*/



        System.out.println("NAME = " + name);
        System.out.println("AGE = " + age);
    }


}
