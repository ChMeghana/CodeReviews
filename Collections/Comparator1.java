package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 5000));
        employees.add(new Employee(102, "Bob", 7000));
        employees.add(new Employee(103, "Charlie", 5000));
        employees.add(new Employee(104, "David", 6000));

        Collections.sort(employees, Comparator
                .comparingDouble(Employee::getSalary).reversed()
                .thenComparing(Employee::getName));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
