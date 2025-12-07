package MultipleExceptionHandlingPriority;


import java.io.IOException;
import java.sql.SQLException;

public class MultipleException {
    public static void main(String[] args) {
        MultiExceptionDemo demo = new MultiExceptionDemo();

        String[] testInputs = {null, "io", "sql", "valid"};

        for (String input : testInputs) {
            try {
                demo.performOperation(input);

            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: " + e.getMessage());

            } catch (IOException e) {
                System.out.println("Caught IOException: " + e.getMessage());

            } catch (SQLException e) {
                System.out.println("Caught SQLException: " + e.getMessage());
            }

            System.out.println("------------------------");
        }
    }
}

