public class Swapcase {
    public static void main(String[] args) {
        String str = "HeLLo WoRLD";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += ch;
        }
        System.out.println(result);
    }
}
