package org.example.lambdaexp;
import java.util.*;

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}

public class Test10 {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "HR", 55000),
                new Employee("Charlie", "IT", 80000),
                new Employee("David", "Finance", 62000)
        );

        employees.stream()
                .filter(e -> e.salary > 60000)
                .map(e -> e.name.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
