package layerexceptions;

class DAOException extends Exception {
    public DAOException(String msg, Throwable cause) { super(msg, cause); }
}

class ApplicationException extends Exception {
    public ApplicationException(String msg, Throwable cause) { super(msg, cause); }
}
