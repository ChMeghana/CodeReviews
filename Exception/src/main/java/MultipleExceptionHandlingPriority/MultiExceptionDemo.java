

package MultipleExceptionHandlingPriority;

import java.io.IOException;
import java.sql.SQLException;


class MultiExceptionDemo {

    public void performOperation(String input) throws IOException, SQLException {
        if (input == null) {
            throw new NullPointerException("Input cannot be null");
        }

        if (input.equals("io")) {
            throw new IOException("Simulated IO exception");
        }

        if (input.equals("sql")) {
            throw new SQLException("Simulated SQL exception");
        }

        System.out.println("Operation successful: " + input);
    }
}

