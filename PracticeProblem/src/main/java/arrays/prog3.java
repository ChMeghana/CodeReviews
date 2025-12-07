package arrays;

public class prog3 {
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            super();  // calls Parent constructor
            System.out.println("Child Constructor");
        }
    }








}
