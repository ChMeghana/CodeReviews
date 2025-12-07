package NestedException;

public class NestedException {
    public static void main(String[] args) {
        UserController controller = new UserController();

        try {
            controller.handleRequest();

        } catch (ApplicationException e) {
            System.out.println("Top-level Exception: " + e.getMessage());
            System.out.println("--- Full Cause Chain ---");
            e.printStackTrace();
        }
    }
}

