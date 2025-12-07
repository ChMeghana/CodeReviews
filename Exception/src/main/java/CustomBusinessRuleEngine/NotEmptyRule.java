package CustomBusinessRuleEngine;

class NotEmptyRule implements BusinessRule {
    @Override
    public void validate(String data) throws RuleViolationException {
        if (data == null || data.isEmpty()) {
            throw new RuleViolationException("Data cannot be empty");
        }
    }
}

class MinLengthRule implements BusinessRule {
    private int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String data) throws RuleViolationException {
        if (data.length() < minLength) {
            throw new RuleViolationException("Data must be at least " + minLength + " characters");
        }
    }
}

class NoDigitRule implements BusinessRule {
    @Override
    public void validate(String data) throws RuleViolationException {
        if (data.matches(".*\\d.*")) {
            throw new RuleViolationException("Data must not contain digits");
        }
    }
}

