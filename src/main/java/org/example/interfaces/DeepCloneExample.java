package org.example.interfaces;

// Address class used as a nested object
class Address {
    String city;
    Address(String city) {
        this.city = city;
    }

    // Copy constructor for deep copying
    Address(Address addr) {
        this.city = addr.city;
    }
}

// Person class implementing deep cloning
class Person1 implements Cloneable{

    String name;
    Address address;

    Person1(String name, Address address){

        this.name = name;
        this.address = address;
    }

    // Overriding clone() for deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException{

        // Create new Address object to achieve deep copy
        Person1 cloned = (Person1) super.clone();
        cloned.address = new Address(this.address);
        return cloned;
    }
}

public class DeepCloneExample{

    public static void main(String[] args){

        try {
            // Create original object
            Person1 p1 = new Person1("Alice", new Address("New York"));

            // Clone original object
            Person1 p2 = (Person1) p1.clone();

            // Modify clone’s nested object
            p2.address.city = "London";

            System.out.println("Original City: " + p1.address.city);
            System.out.println("Clone City: " + p2.address.city);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}