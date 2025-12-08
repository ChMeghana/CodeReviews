package org.example.exceptions;
import java.util.ArrayList;
import java.util.List;

class RuleViolationException extends Exception { public RuleViolationException(String msg) { super(msg); } }
class ProcessingException extends Exception {
    public ProcessingException(String msg, List<RuleViolationException> causes) {
        super(msg + " - " + causes.size() + " rules failed");
        causes.forEach(e -> System.out.println(e.getMessage()));
    }
}

public class RuleEngineTest {
    public static void main(String[] args) throws ProcessingException {
        List<RuleViolationException> errors = new ArrayList<>();
        String[] rules = {"Rule1", "Rule2", "Rule3"};

        for (String rule : rules) {
            try {
                if (rule.equals("Rule2")) throw new RuleViolationException(rule + " failed");
            } catch (RuleViolationException e) {
                errors.add(e);
            }
        }

        if (!errors.isEmpty()) throw new ProcessingException("Processing failed", errors);
    }
}

