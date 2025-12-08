package org.example.collections;
import java.util.*;

class Stu {
    String name; int grade; List<String> subs;
    Stu(String n, int g, List<String> s){name=n;grade=g;subs=s;}
    public String toString(){return name+"("+grade+","+subs.size()+")";}
}

public class C28 {
    public static void main(String[] args) {
        List<Stu> list = Arrays.asList(
                new Stu("A",90,Arrays.asList("Math","Eng")),
                new Stu("B",90,Arrays.asList("Math","Sci","Eng")),
                new Stu("C",85,Arrays.asList("Math"))
        );
        list.sort(Comparator.comparingInt((Stu s)->s.grade)
                .thenComparingInt(s->s.subs.size()).reversed());
        System.out.println(list);
    }
}
