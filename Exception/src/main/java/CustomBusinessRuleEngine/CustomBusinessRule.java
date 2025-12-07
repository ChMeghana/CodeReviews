package CustomBusinessRuleEngine;

public class CustomBusinessRule {
    public static void main(String[] args) {
        RuleEngine engine = new RuleEngine();

        // Add rules
        engine.addRule(new NotEmptyRule());
        engine.addRule(new MinLengthRule(5));
        engine.addRule(new NoDigitRule());

        String testData = "abc1"; // Will fail MinLengthRule and NoDigitRule

        try {
            engine.process(testData);
        } catch (ProcessingException e) {
            System.out.println(e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}

