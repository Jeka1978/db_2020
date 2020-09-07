package com.deutsche;

import demo.Person;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {

        var person = new Person("asd",12);
        System.out.println(person);
    }
}
