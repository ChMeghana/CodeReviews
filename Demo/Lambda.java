package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

interface Lambdademo{
    int showMessage(int a, int b);
}
public class Lambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream()
//                .filter(n->n%2==1)
//                .map(n->n*2)
//                .forEach(System.out::println);

//        List<String> list1 = new ArrayList<>(Arrays.asList("gani","venky","steve"));
//        list1.stream()
//                .map(n ->n.toUpperCase())
//                .forEach(System.out::println);
        list.add(7);
        list.stream().forEach(System.out::println);

    }
}
