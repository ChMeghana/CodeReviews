package Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String msg) { super(msg); }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String msg) { super(msg); }
}

class InvalidPhoneException extends Exception {
    public InvalidPhoneException(String msg) { super(msg); }
}

class Validator {
    public void validateEmail(String email) throws InvalidEmailException {
        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid email: " + email);
        }
    }

    public void validatePassword(String password) throws WeakPasswordException {
        if (password == null || password.length() < 6) {
            throw new WeakPasswordException("Weak password: " + password);
        }
    }

    public void validatePhone(String phone) throws InvalidPhoneException {
        if (phone == null || !Pattern.matches("\\d{10}", phone)) {
            throw new InvalidPhoneException("Invalid phone number: " + phone);
        }
    }
}

public class CustomValidation {
    public static void main(String[] args) {
        String email = "invalidEmail.com";
        String password = "123";
        String phone = "12345";

        Validator validator = new Validator();
        List<Exception> exceptions = new ArrayList<>();

        try { validator.validateEmail(email); } catch (Exception e) { exceptions.add(e); }
        try { validator.validatePassword(password); } catch (Exception e) { exceptions.add(e); }
        try { validator.validatePhone(phone); } catch (Exception e) { exceptions.add(e); }

        if (!exceptions.isEmpty()) {
            System.out.println("Validation errors:");
            for (Exception e : exceptions) {
                System.out.println("- " + e.getMessage());
            }
        } else {
            System.out.println("All inputs are valid.");
        }
    }
}

