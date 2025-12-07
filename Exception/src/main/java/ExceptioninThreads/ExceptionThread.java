package ExceptioninThreads;

public class ExceptionThread {
    public static void main(String[] args) {

        // Create a thread
        WorkerThread thread = new WorkerThread();

        // Set UncaughtExceptionHandler to catch exceptions from the thread
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Exception caught from thread: " + t.getName());
            System.out.println("Exception message: " + e.getMessage());
        });

        // Start the thread
        thread.start();

        System.out.println("Main thread continues running...");
    }
}

