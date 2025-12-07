package RetryMechanismExceptions;

class NetworkTimeoutException extends Exception {
    public NetworkTimeoutException(String message) {
        super(message);
    }
}

class ServiceUnavailableException extends Exception {
    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }
}

