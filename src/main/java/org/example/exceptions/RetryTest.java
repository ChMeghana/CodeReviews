package org.example.exceptions;
import java.util.Random;

class NetworkTimeoutException extends Exception { public NetworkTimeoutException(String msg) { super(msg); } }
class ServiceUnavailableException extends Exception { public ServiceUnavailableException(String msg) { super(msg); } }

public class RetryTest {
    static Random random = new Random();

    public static void main(String[] args) throws ServiceUnavailableException {
        int retries = 3;
        while (retries-- > 0) {
            try {
                networkCall();
                System.out.println("Network call successful");
                break;
            } catch (NetworkTimeoutException e) {
                System.out.println("Retry due to: " + e.getMessage());
                if (retries == 0) throw new ServiceUnavailableException("Service unavailable after retries");
            }
        }
    }

    static void networkCall() throws NetworkTimeoutException {
        if (random.nextBoolean()) throw new NetworkTimeoutException("Timeout occurred");
    }
}

