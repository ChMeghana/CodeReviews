package RetryMechanismExceptions;

class Service {
    private NetworkService networkService = new NetworkService();

    public void performOperation() throws ServiceUnavailableException {
        int maxRetries = 3;
        int attempt = 0;

        while (attempt < maxRetries) {
            try {
                attempt++;
                System.out.println("Attempt " + attempt + "...");
                networkService.call();
                return; // success, exit

            } catch (NetworkTimeoutException e) {
                System.out.println("Attempt " + attempt + " failed: " + e.getMessage());
                if (attempt == maxRetries) {
                    throw new ServiceUnavailableException("Service unavailable after " + maxRetries + " attempts", e);
                }
                // Optional: wait before retrying
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        }
    }
}

