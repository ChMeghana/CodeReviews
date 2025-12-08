package org.example.interfaces;
import java.io.*;
//import java.io.Serializable;

// Serializable class
class Employee implements Serializable { //NotSerializableException if not implemented Serializable (Associated objects)
    // Normal variable → gets serialized
    int id;

    // final → constant, gets serialized normally
    final String company = "Altair";

    // transient → skipped during serialization (will become default value)
    transient String password;

    // transient final → constant but also skipped during serialization
    // If not initialized here, it will stay null after deserialization
    transient final String secret = "TOP-SECRET";

    String name;

    Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(1, "John", "mypassword");

        // --- Serialization: object → file ---
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        //ObjectOutputStream class contains writeObject() method for serializing an Object
        out.writeObject(emp);
        out.close();

        System.out.println("Object serialized successfully.\n");

        // --- Deserialization: file → object ---
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser"));
        //ObjectInputStream class contains readObject() method
        Employee e2 = (Employee) in.readObject();
        in.close();

        // --- Print values before and after ---
        System.out.println("After deserialization:");
        System.out.println("ID: " + e2.id);                 // same as before
        System.out.println("Name: " + e2.name);             // same as before
        System.out.println("Company (final): " + e2.company); // serialized normally
        System.out.println("Password (transient): " + e2.password); // becomes null
        System.out.println("Secret (transient final): " + e2.secret); // becomes null
    }
}
