public class ToggleCaseString {


        public static String toggleCase(String input) {
            StringBuilder toggled = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // If lowercase, convert to uppercase
                if (Character.isLowerCase(ch)) {
                    toggled.append(Character.toUpperCase(ch));
                }
                // If uppercase, convert to lowercase
                else if (Character.isUpperCase(ch)) {
                    toggled.append(Character.toLowerCase(ch));
                }
                // Otherwise, keep unchanged (digits, punctuation, etc.)
                else {
                    toggled.append(ch);
                }
            }

            return toggled.toString();
        }

        public static void main(String[] args) {
            String text = "Hello Java WORLD! This Is Venkat Sundaraneedi!";
            String result = toggleCase(text);
            System.out.println("Original String: " + text);
            System.out.println("Toggled Case String: " + result);
        }
    }


