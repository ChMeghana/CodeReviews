package org.example;

import java.util.*;

public class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }
    public String toString() {
        return "name: " + name + ", salary: " + salary;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 45000));
        employeeList.add(new Employee("Sai", 55000));
        employeeList.add(new Employee("Rahul", 57000));
        employeeList.sort(Comparator.comparingInt((Employee e) -> e.salary));
        System.out.println(employeeList);


    }
}
