public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        char replaceWith = '-';
        String result = str.replace(' ', replaceWith);
        System.out.println(result);
    }
}
