package GlobalExceptionLogger;

class DatabaseService {
    public void connect() throws Exception {
        try {
            // Simulate DB failure
            throw new RuntimeException("Database connection failed");
        } catch (Exception e) {
            ExceptionLogger.logAndRethrow(e, "DatabaseService: Failed to connect to DB");
        }
    }
}

class FileService {
    public void readFile() throws Exception {
        try {
            // Simulate file read failure
            throw new RuntimeException("File not found");
        } catch (Exception e) {
            ExceptionLogger.logAndRethrow(e, "FileService: Failed to read file");
        }
    }
}

class NetworkService {
    public void sendRequest() throws Exception {
        try {
            // Simulate network failure
            throw new RuntimeException("Network timeout");
        } catch (Exception e) {
            ExceptionLogger.logAndRethrow(e, "NetworkService: Failed to send request");
        }
    }
}

