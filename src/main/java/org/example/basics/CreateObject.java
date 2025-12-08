package org.example.basics;

import java.io.*;
import java.lang.reflect.Constructor;

class Student2 implements Cloneable, Serializable {
    private String name;

    public Student2() {
        this.name = "Default Student";
    }

    public Student2(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Student name: " + name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CreateObject {
    public static void main(String[] args) throws Exception {

        //new keyword
        Student2 s1 = new Student2("Using new keyword");
        s1.show();

        //clone() method
        Student2 s2 = (Student2) s1.clone();
        s2.show();

        //using Class.newInstance()
        Student2 s3 = Student2.class.newInstance(); // calls default constructor
        s3.show();

        //using Constructor.newInstance()
        Constructor<Student2> constructor = Student2.class.getConstructor(String.class);
        Student2 s4 = constructor.newInstance("Using Constructor.newInstance()");
        s4.show();

        //using Deserialization
        // Serialize s1 object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(s1);
        oos.close();

        // Deserialize to create new object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Student2 s5 = (Student2) ois.readObject();
        ois.close();

        s5.show();
    }
}
