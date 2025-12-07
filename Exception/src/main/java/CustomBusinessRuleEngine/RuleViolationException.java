package CustomBusinessRuleEngine;

// Exception for a single rule violation
class RuleViolationException extends Exception {
    public RuleViolationException(String message) {
        super(message);
    }
}

// Exception that summarizes multiple rule violations
class ProcessingException extends Exception {
    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

