package banking;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String msg) { super(msg); }
}

class InactiveAccountException extends Exception {
    public InactiveAccountException(String msg) { super(msg); }
}
