package GlobalExceptionLogger;

public class GlobalException {
    public static void main(String[] args) {
        DatabaseService db = new DatabaseService();
        FileService file = new FileService();
        NetworkService network = new NetworkService();

        try {
            db.connect();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        try {
            file.readFile();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        try {
            network.sendRequest();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}

