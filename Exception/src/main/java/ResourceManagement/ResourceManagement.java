package ResourceManagement;

public class ResourceManagement {
    public static void main(String[] args) {
        ResourceOperations ops = new ResourceOperations();

        try {
            ops.performOperations();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

