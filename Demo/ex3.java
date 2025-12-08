package Demo;

import java.util.Objects;
import java.util.stream.Stream;

public class ex3 {
    public static void main(String[] args) {
        Stream.Builder<Object> builder = Stream.builder();
        builder.add(1);
        builder.add("String");

        Stream<Object> s = builder.build();
        s.forEach(System.out::println);
    }
}
