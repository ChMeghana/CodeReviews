public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        if (str1.length() == str2.length() && (str1 + str1).contains(str2))
            System.out.println(str1 + " and " + str2 + " are rotations");
        else
            System.out.println(str1 + " and " + str2 + " are not rotations");
    }
}
