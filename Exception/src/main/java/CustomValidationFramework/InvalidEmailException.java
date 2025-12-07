package CustomValidationFramework;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class InvalidPhoneException extends Exception {
    public InvalidPhoneException(String message) {
        super(message);
    }
}

