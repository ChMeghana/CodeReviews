package org.example.lambdaexp;
import java.util.function.Function;

public class Test8 {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        System.out.println(doubleIt.andThen(add10).apply(5)); // (5*2)=10 → 10+10=20
        System.out.println(doubleIt.compose(add10).apply(5)); // (5+10)=15 → 15*2=30
    }
}
