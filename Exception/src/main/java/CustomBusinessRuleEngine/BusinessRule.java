package CustomBusinessRuleEngine;

interface BusinessRule {
    void validate(String data) throws RuleViolationException;
}

