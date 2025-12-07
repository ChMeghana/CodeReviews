package CustomValidationFramework;

public class TestValidation {
    public static void main(String[] args) {
        String email = "invalidemail.com";
        String password = "pass"; // too short, no digit
        String phone = "12345"; // invalid

        try {
            Validator.validate(email, password, phone);
        } catch (Exception e) {
            System.out.println("Validation Summary: " + e.getMessage());
        }
    }
}

