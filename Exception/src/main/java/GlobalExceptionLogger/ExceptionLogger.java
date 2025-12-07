package GlobalExceptionLogger;

import java.time.LocalDateTime;

class ExceptionLogger {

    // Centralized logging method
    public static void log(Exception e, String customMessage) {
        System.out.println("[" + LocalDateTime.now() + "] ERROR: " + customMessage);
        System.out.println("Original exception: " + e);
        System.out.println("----------------------------");
    }

    // Wrap and rethrow preserving stack trace
    public static void logAndRethrow(Exception e, String customMessage) throws Exception {
        log(e, customMessage);
        // Rethrow with original cause preserved
        throw new Exception(customMessage, e);
    }
}
