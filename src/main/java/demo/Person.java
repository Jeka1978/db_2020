package demo;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */


public class Person implements Serializable {

    public static int counter;

    private String name;
    private String name2;
    private String name4;
    private String name5;
    private String name6;
    private transient double age =7;
    private transient double x;

    {
        this.counter++;
        System.out.println("person was created");
        System.out.println("age = " + age);
    }

    public Person() {
        System.out.println("empty constructor");
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
        System.out.println("NAME = " + name2);
        System.out.println("NAME = " + name4);
        System.out.println("AGE = " + age);
    }

}
