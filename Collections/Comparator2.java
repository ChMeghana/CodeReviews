package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    double grade;
    List<String> subjects;

    Student(String name, double grade, List<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
    }

    public double getGrade() {
        return grade;
    }

    public int getSubjectCount() {
        return subjects.size();
    }

    @Override
    public String toString() {
        return name + " Grade: " + grade + " Subjects: " + subjects.size();
    }
}

public class Comparator2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90, List.of("Math", "Science")));
        students.add(new Student("Bob", 85, List.of("Math")));
        students.add(new Student("Charlie", 90, List.of("Math", "Science", "English")));
        students.add(new Student("David", 85, List.of("Math", "English")));

        Collections.sort(students, Comparator
                .comparingDouble(Student::getGrade)
                .thenComparing(Student::getSubjectCount));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
