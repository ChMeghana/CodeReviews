package ResourceManagement;

import java.util.Random;

class ResourceOperations {
    private Random random = new Random();

    public void performOperations() throws Exception {
        // try-with-resources ensures resources are closed automatically
        try (
                DatabaseConnection db = new DatabaseConnection();
                FileResource file = new FileResource();
                NetworkSocket socket = new NetworkSocket()
        ) {
            db.open();
            file.open();
            socket.open();

            // Simulate random failure
            if (random.nextBoolean()) {
                throw new Exception("Operation failed during resource usage");
            }

            System.out.println("All operations completed successfully!");

        } // resources automatically closed here
    }
}

