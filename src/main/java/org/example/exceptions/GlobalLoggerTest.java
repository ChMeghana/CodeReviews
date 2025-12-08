package org.example.exceptions;
class Logger {
    static void log(Exception e) {
        System.out.println("LOG: " + e.getClass().getSimpleName() + " - " + e.getMessage());
    }
}

class Worker {
    void doWork() throws Exception {
        throw new Exception("Worker failed");
    }
}

public class GlobalLoggerTest {
    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        try {
            w.doWork();
        } catch (Exception e) {
            Logger.log(e);
            throw new Exception("Custom message wrapping original", e);
        }
    }
}

