package org.example.streams;
import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class AvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Alex", 55000),
                new Employee("Sam", 65000)
        );

        double avg = employees.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0);

        System.out.println("Average Salary = " + avg);
    }
}
