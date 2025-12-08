package org.example.streams;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,10,30,40,20,50);

        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
