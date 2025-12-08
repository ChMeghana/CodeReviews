package org.example.basics;

public class TestCompare {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 101);
        Student s3 = new Student("Charlie", 102);

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}