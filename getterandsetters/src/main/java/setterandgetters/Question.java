//package setterandgetters;
//
//public class Question {
//    //1q)What are getters and setters in Java?
//
//    class Person {
//        private String name; // private field
//
//        public String getName() {   // Getter
//            return name;
//        }
//
//        public void setName(String name) { // Setter
//            this.name = name;
//        }
//    }
//
//}
////2Q) Why do we use getters and setters instead of making variables public?
//
//class Student {
//    // Good practice
//    private int marks;
//
//    public void setMarks(int marks) {
//        if (marks >= 0 && marks <= 100) { // controlled access
//            this.marks = marks;
//        } else {
//            System.out.println("Invalid marks!");
//        }
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//}
//
////Q3: What is encapsulation and how do getters and setters support it?
//
//class BankAccount {
//    private double balance;  // hidden data
//
//    public double getBalance() {  // controlled access
//        return balance;
//    }
//
//    public void deposit(double amount) { // safe update
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//}
////Q4: Can you have a read-only or write-only property?
//
//class Employee {
//    private String name;
//    private double salary;
//
//    // Read-only property
//    public String getName() {
//        return name;
//    }
//
//    // Write-only property
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
//
////Q5: How can we add validation logic inside setters?
//
//class Person {
//    private int age;
//
//    public void setAge(int age) {
//        if (age > 0) {
//            this.age = age;
//        } else {
//            System.out.println("Age must be positive!");
//        }
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
////Q6: Naming conventions
//
//class LightBulb {
//    private boolean isOn;
//
//    public boolean isOn() {   // Boolean getter
//        return isOn;
//    }
//
//    public void setOn(boolean on) { // Setter
//        this.isOn = on;
//    }
//}
////Q7: Disadvantages of writing manually
//class Car {
//    private String model;
//    private int year;
//
//    // So many getters and setters to write manually!
//    public String getModel() { return model; }
//    public void setModel(String model) { this.model = model; }
//
//    public int getYear() { return year; }
//    public void setYear(int year) { this.year = year; }
//}
////Q8: How does Lombok help?
////Lombok auto-generates getters/setters at compile time — no need to type them.
//import lombok.Getter;
//import lombok.Setter;
//
//public class Book {
//    @Getter @Setter
//    private String title;
//
//    @Getter @Setter
//    private double price;
//}
////Q9: What happens if you don’t create getters and setters?
//class Secret {
//    private String code = "TOP_SECRET";
//}
//
//// In another class
//// Secret s = new Secret();
//// System.out.println(s.code); ❌ ERROR (code has private access)
////Q10: How do frameworks use getters/setters?
//public class User {
//    private String username;
//    private String email;
//
//    // Frameworks like Spring, Hibernate, Jackson use these:
//    public String getUsername() { return username; }
//    public void setUsername(String username) { this.username = username; }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//}
//
