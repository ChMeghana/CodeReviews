package org.example.exceptions;

import java.util.ArrayList;
import java.util.List;

class InvalidEmailException extends Exception { public InvalidEmailException(String msg) { super(msg); } }
class WeakPasswordException extends Exception { public WeakPasswordException(String msg) { super(msg); } }
class InvalidPhoneException extends Exception { public InvalidPhoneException(String msg) { super(msg); } }

class Validator {
    static void validate(String email, String password, String phone) throws Exception {
        List<Exception> errors = new ArrayList<>();
        if (!email.contains("@")) errors.add(new InvalidEmailException("Email invalid"));
        if (password.length() < 6) errors.add(new WeakPasswordException("Password too weak"));
        if (!phone.matches("\\d{10}")) errors.add(new InvalidPhoneException("Phone invalid"));

        if (!errors.isEmpty()) {
            for (Exception e : errors) System.out.println(e.getMessage());
        } else {
            System.out.println("All validations passed");
        }
    }
}

public class ValidationTest {
    public static void main(String[] args) throws Exception {
        Validator.validate("userexample.com", "123", "12345");
    }
}
