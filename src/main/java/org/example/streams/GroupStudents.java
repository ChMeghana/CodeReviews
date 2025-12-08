package org.example.streams;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class GroupStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "A"),
                new Student("Sara", "B"),
                new Student("Ravi", "A"),
                new Student("Meena", "C"),
                new Student("Arun", "B")
        );

        Map<String, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.grade));

        grouped.forEach((grade, list) -> {
            System.out.println("Grade: " + grade);
            list.forEach(s -> System.out.println(" - " + s.name));
        });
    }
}
