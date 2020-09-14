package java_8_examples.streams;

import demo.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Stream<Employee> employeeStream = Stream.of(Employee.builder().salary(100).build(), Employee.builder().salary(3999).build());
        employeeStream.mapToInt(Employee::getSalary).summaryStatistics();


      Stream.of(Employee.builder().build())
                .collect(Collectors.groupingBy(Employee::getSalary,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        boolean b = Stream.iterate(1, integer -> ++integer).anyMatch(integer -> integer == 10);
        System.out.println("b = " + b);

        IntStream intStream = IntStream.of(1, 2, 3);
        IntSummaryStatistics statistics = intStream.summaryStatistics();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Optional<Integer> optionalInteger = integerStream.filter(integer -> integer>100).reduce(Integer::sum);

        Integer sum = optionalInteger.orElse(2);
        System.out.println("sum = " + sum);



        List<String> rawList = List.of("java", "java", "scala");
        Stream<String> stream = rawList
                .stream();
        Map<Integer, String> map = stream
                .distinct()
                .parallel()
                .filter(s -> s.startsWith("s"))
                .map(String::length)

                .collect(toMap(integer -> integer, o -> "a"));

        System.out.println("list = " + map);
        System.out.println("rawList = " + rawList);
        stream.forEach(System.out::println);

    }
}







