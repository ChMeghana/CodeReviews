public class CountVowelsConsonants {


        public static void main(String[] args) {
            String str = "Hello Java World! This is Venkat Sundaraneedi";
            str = str.toLowerCase();  // convert to lowercase to make checking simpler

            int vowels = 0, consonants = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is an alphabet
                if (ch >= 'a' && ch <= 'z') {
                    // Check for vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        vowels++;
                    else
                        consonants++;
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }
    }


