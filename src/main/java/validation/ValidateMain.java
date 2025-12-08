package validation;

public class ValidateMain {
    public static void main(String[] args) {
        try {
            Validator.validate("invalidemail.com", "pass", "1234");

        } catch (Exception e) {
            System.out.println("\nValidation Summary: " + e.getMessage());
        }
    }
}
