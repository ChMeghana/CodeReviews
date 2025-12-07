package RetryMechanismExceptions;

import java.util.Random;

class NetworkService {
    private Random random = new Random();

    // Simulated network call
    public void call() throws NetworkTimeoutException {
        // 50% chance of timeout
        if (random.nextBoolean()) {
            throw new NetworkTimeoutException("Network timeout occurred");
        }
        System.out.println("Network call successful!");
    }
}

