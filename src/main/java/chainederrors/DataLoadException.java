package chainederrors;

class DataLoadException extends Exception {
    public DataLoadException(String msg, Throwable cause) { super(msg, cause); }
}

class SystemInitializationException extends Exception {
    public SystemInitializationException(String msg, Throwable cause) { super(msg, cause); }
}
