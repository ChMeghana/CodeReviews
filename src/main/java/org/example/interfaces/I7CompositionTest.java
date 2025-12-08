package org.example.interfaces;

import java.io.*;

class Customer {
    String name;
    Customer(String n) { name = n; }
}

class Order implements Serializable {
    int id;
    transient Customer customer;  // must be transient!
    Order(int id, Customer c) { this.id=id; this.customer=c; }
}

public class I7CompositionTest {
    public static void main(String[] args) throws Exception {
        Order o = new Order(10, new Customer("Alice"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.ser"));
        oos.writeObject(o); oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("order.ser"));
        Order2 o2 = (Order2) ois.readObject();
        ois.close();

       // System.out.println(o2.customer); // null
    }
}
