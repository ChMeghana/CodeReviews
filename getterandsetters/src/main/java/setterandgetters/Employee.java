package setterandgetters;

// Employee.java
import lombok.Getter;
import lombok.Setter;

@Getter   // generates getters for all fields
@Setter   // generates setters for all fields
public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", 25, 60000);

        // ✅ Access values using Lombok-generated getters
        System.out.println("Name: " + emp.getName());   // Alice
        System.out.println("Age: " + emp.getAge());     // 25
        System.out.println("Salary: " + emp.getSalary());// 60000.0

        // ✅ Modify values using Lombok-generated setters
        emp.setName("Bob");
        emp.setAge(30);
        emp.setSalary(75000);

        // ✅ Verify updated values
        System.out.println("Updated Name: " + emp.getName());   // Bob
        System.out.println("Updated Age: " + emp.getAge());     // 30
        System.out.println("Updated Salary: " + emp.getSalary());// 75000.0
    }
}