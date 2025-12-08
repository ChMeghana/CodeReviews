package org.example.collections;
import java.util.*;

class Emp {
    int id; String name; double sal;
    Emp(int id, String name, double sal){this.id=id;this.name=name;this.sal=sal;}
    public String toString(){return name+"("+sal+")";}
}

public class C27 {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
                new Emp(1,"John",5000),
                new Emp(2,"Alice",7000),
                new Emp(3,"Bob",7000)
        );
        list.sort(Comparator.comparingDouble((Emp e)->e.sal).reversed().thenComparing(e->e.name));
        System.out.println(list);
    }
}
