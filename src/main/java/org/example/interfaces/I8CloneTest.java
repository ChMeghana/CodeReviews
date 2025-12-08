//package org.example.interfaces;
//
//class Department implements Cloneable {
//    String name;
//    Department(String n) { name = n; }
//
//    protected Department clone() throws CloneNotSupportedException {
//        return (Department) super.clone();
//    }
//}
//
//class Employee implements Cloneable {
//    String name;
//    Department dept;
//
//    Employee(String n, Department d) { name=n; dept=d; }
//
//    // Shallow clone
//    protected Employee clone() throws CloneNotSupportedException {
//        return (Employee) super.clone();
//    }
//
//    // Deep clone
//    Employee deepClone() throws CloneNotSupportedException {
//        return new Employee(name, dept.clone());
//    }
//}
//
//public class I8CloneTest {
//    public static void main(String[] args) throws Exception {
//        Employee e1 = new Employee("John", new Department("IT"));
//
//        Employee e2 = e1.clone();        // shallow
//        Employee e3 = e1.deepClone();    // deep
//
//        e1.dept.name = "HR";
//
//        System.out.println(e2.dept.name); // HR  (same object)
//        System.out.println(e3.dept.name); // IT  (different object)
//    }
//}
