
    import java.util.function.Consumer;

    public class ConsumerExample {
        public static void main(String[] args) {
            Consumer<String> printUpper = text -> System.out.println(text.toUpperCase());

            printUpper.accept("java lambda");  // Output: JAVA LAMBDA
        }
    }


