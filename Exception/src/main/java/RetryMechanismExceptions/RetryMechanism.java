package RetryMechanismExceptions;

public class RetryMechanism {
    public static void main(String[] args) {
        Service service = new Service();

        try {
            service.performOperation();
        } catch (ServiceUnavailableException e) {
            System.out.println("Final Error: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}

