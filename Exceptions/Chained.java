package Exceptions;


import java.io.FileNotFoundException;

class DataLoadException extends Exception {
    public DataLoadException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class SystemInitializationException extends Exception {
    public SystemInitializationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class DataLoader {
    public void loadData() throws DataLoadException {
        try {
            throw new FileNotFoundException("Data file not found");
        } catch (FileNotFoundException e) {
            throw new DataLoadException("Failed to load data", e);
        }
    }
}

class SystemInitializer {
    private DataLoader loader = new DataLoader();

    public void initialize() throws SystemInitializationException {
        try {
            loader.loadData();
        } catch (DataLoadException e) {
            throw new SystemInitializationException("System initialization failed", e);
        }
    }
}

public class Chained {
    public static void main(String[] args) {
        SystemInitializer initializer = new SystemInitializer();
        try {
            initializer.initialize();
        } catch (SystemInitializationException e) {
            System.out.println("Caught: " + e.getMessage());
            Throwable cause = e.getCause();
            while (cause != null) {
                System.out.println("Caused by: " + cause.getMessage());
                cause = cause.getCause();
            }
        }
    }
}

