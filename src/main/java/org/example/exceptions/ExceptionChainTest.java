package org.example.exceptions;

class DataLoadException extends Exception {
    public DataLoadException(String msg, Throwable cause) { super(msg, cause); }
}

class SystemInitializationException extends Exception {
    public SystemInitializationException(String msg, Throwable cause) { super(msg, cause); }
}

public class ExceptionChainTest {
    public static void main(String[] args) {
        try {
            initializeSystem();
        } catch (SystemInitializationException e) {
            e.printStackTrace();
        }
    }

    static void initializeSystem() throws SystemInitializationException {
        try {
            loadData();
        } catch (DataLoadException e) {
            throw new SystemInitializationException("System init failed", e);
        }
    }

    static void loadData() throws DataLoadException {
        try {
            throw new java.io.FileNotFoundException("config.txt not found");
        } catch (java.io.FileNotFoundException e) {
            throw new DataLoadException("Failed to load data", e);
        }
    }
}
