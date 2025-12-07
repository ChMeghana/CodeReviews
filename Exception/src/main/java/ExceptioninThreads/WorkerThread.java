package ExceptioninThreads;

class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Worker thread started");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        // Simulate an exception
        throw new RuntimeException("Something went wrong in worker thread!");
    }
}

