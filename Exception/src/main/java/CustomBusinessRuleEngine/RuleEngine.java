package CustomBusinessRuleEngine;

import java.util.ArrayList;
import java.util.List;

class RuleEngine {

    private List<BusinessRule> rules = new ArrayList<>();

    public void addRule(BusinessRule rule) {
        rules.add(rule);
    }

    public void process(String data) throws ProcessingException {
        List<RuleViolationException> violations = new ArrayList<>();

        for (BusinessRule rule : rules) {
            try {
                rule.validate(data);
            } catch (RuleViolationException e) {
                violations.add(e);
            }
        }

        if (!violations.isEmpty()) {
            // Summarize all violations into one exception
            StringBuilder summary = new StringBuilder("Rule processing failed:\n");
            for (RuleViolationException e : violations) {
                summary.append("- ").append(e.getMessage()).append("\n");
            }
            throw new ProcessingException(summary.toString(), violations.get(0));
        }

        System.out.println("All rules passed successfully!");
    }
}

