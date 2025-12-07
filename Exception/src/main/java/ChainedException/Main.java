package ChainedException;

public class Main {
    public static void main(String[] args) {

        SystemInitializer initializer = new SystemInitializer();

        try {
            initializer.initializeSystem();

        } catch (SystemInitializationException e) {
            System.out.println("Top-level Exception: " + e.getMessage());
            System.out.println("\n--- Full Cause Chain ---");
            e.printStackTrace();
        }
    }
}
