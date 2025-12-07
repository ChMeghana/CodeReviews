package CustomValidationFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Validator {

    public static void validate(String email, String password, String phone) throws Exception {
        List<Exception> errors = new ArrayList<>();

        // Email validation
        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
            errors.add(new InvalidEmailException("Invalid email format: " + email));
        }

        // Password validation (at least 8 chars, 1 digit)
        if (password == null || password.length() < 8 || !password.matches(".*\\d.*")) {
            errors.add(new WeakPasswordException("Weak password: must be at least 8 chars with a number"));
        }

        // Phone validation (10 digits)
        if (phone == null || !phone.matches("\\d{10}")) {
            errors.add(new InvalidPhoneException("Invalid phone number: " + phone));
        }

        // If any errors, throw a combined exception
        if (!errors.isEmpty()) {
            for (Exception e : errors) {
                System.out.println(e.getMessage());
            }
            throw new Exception("Validation failed with " + errors.size() + " error(s).");
        }

        System.out.println("All validations passed!");
    }
}

