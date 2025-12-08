public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread started");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Exception caught in thread: " + t.getName());
            System.out.println("Exception message: " + e.getMessage());
        });

        thread.start();

        try {
            thread.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
