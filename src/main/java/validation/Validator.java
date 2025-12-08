package validation;

import java.util.ArrayList;
import java.util.List;

class Validator {

    public static void validate(String email, String pass, String phone) throws Exception {

        List<String> errors = new ArrayList<>();

        if (!email.contains("@"))
            errors.add("Invalid Email: " + email);

        if (pass.length() < 8 || !pass.matches(".*\\d.*"))
            errors.add("Weak Password (must include number)");

        if (!phone.matches("\\d{10}"))
            errors.add("Invalid Phone Number: " + phone);

        if (!errors.isEmpty()) {
            for (String err : errors) {
                System.out.println(err);
            }
            throw new Exception("Validation Failed with " + errors.size() + " error(s).");
        }

        System.out.println("All Inputs Valid!");
    }
}
