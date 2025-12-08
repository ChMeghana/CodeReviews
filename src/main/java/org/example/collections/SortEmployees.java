package org.example.collections;
import java.util.*;

// 15. Sort Custom Objects with Comparator
class Employee {
    String name;
    int salary;
    Employee(String n, int s) { name = n; salary = s; }
    public String toString() { return name + " - " + salary; }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Nikhila", 5000));
        emps.add(new Employee("Sai", 4000));
        emps.add(new Employee("Anu", 5000));

        emps.sort(Comparator.comparingInt((Employee e) -> e.salary)
                .thenComparing(e -> e.name));

        System.out.println(emps);
    }
}
