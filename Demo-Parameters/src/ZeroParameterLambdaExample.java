
    @FunctionalInterface
    interface ZeroParameter {
        void display(); // Functional method with no parameters
    }

    public class ZeroParameterLambdaExample {
        public static void main(String[] args) {

            // Lambda expression with zero parameters
            ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero-parameter lambda expression!");

            // Invoking the method using the lambda expression
            zeroParamLambda.display();
        }
    }

