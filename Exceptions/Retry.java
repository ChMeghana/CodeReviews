package Exceptions;

import java.util.Random;

class NetworkTimeoutException extends Exception {
    public NetworkTimeoutException(String msg) { super(msg); }
}

class ServiceUnavailableException extends Exception {
    public ServiceUnavailableException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class NetworkService {
    private Random random = new Random();

    public void call() throws NetworkTimeoutException {
        if (random.nextInt(100) < 50) { // 50% chance to fail
            throw new NetworkTimeoutException("Network timed out");
        }
        System.out.println("Network call succeeded");
    }
}

public class Retry {
    public static void main(String[] args) {
        NetworkService service = new NetworkService();
        int maxRetries = 3;
        int attempts = 0;

        while (attempts < maxRetries) {
            try {
                service.call();
                break; // success, exit loop
            } catch (NetworkTimeoutException e) {
                attempts++;
                System.out.println("Attempt " + attempts + " failed: " + e.getMessage());
                if (attempts == maxRetries) {
                    try {
                        throw new ServiceUnavailableException("Service unavailable after " + maxRetries + " attempts", e);
                    } catch (ServiceUnavailableException ex) {
                        System.out.println("Final exception: " + ex.getMessage());
                        System.out.println("Original cause: " + ex.getCause().getMessage());
                    }
                }
            }
        }
    }
}

