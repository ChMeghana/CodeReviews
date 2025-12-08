package org.example.interfaces;

class Person implements Cloneable {
    int age;
    String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //shallow cloning
    }
}

public class ClonableI {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 30;

        Person p2 = (Person) p1.clone();
        System.out.println(p2.name); // John
    }
}
