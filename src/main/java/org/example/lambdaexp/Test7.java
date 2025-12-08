package org.example.lambdaexp;

@FunctionalInterface
interface Converter<T, R> {

    R convert(T input);

    default void log() {
        System.out.println("Conversion started...");
    }

    static boolean validate(String s) {
        return s != null && !s.isEmpty();
    }
}

public class Test7 {
    public static void main(String[] args) {

        Converter<String, Integer> converter = (str) -> Integer.parseInt(str);

        converter.log();

        if (Converter.validate("123")) {
            int result = converter.convert("123");
            System.out.println(result);
        }
    }
}
