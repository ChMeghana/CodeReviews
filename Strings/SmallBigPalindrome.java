package Strings;

public class SmallBigPalindrome {
    int checkPalindrome(String str1){

                String rev = "";
                for (int i = str1.length() - 1; i >= 0; i--)
                    rev += str1.charAt(i);

                if (str1.equalsIgnoreCase(rev))
                    return str1.length();
                else
                    return -1;

    }
    public static void main(String[] args) {

        String[] str=new String[]{"MadaM","AbcdcbA","bdb","dab","aa"};
        int[] c=new int[str.length];
        int small=2500000,big=0;
        SmallBigPalindrome obj = new SmallBigPalindrome();
        for(int j=0;j<str.length;j++){
            c[j]=obj.checkPalindrome(str[j]);

            if (c[j] != -1) {
                if (c[j] > big)
                    big = c[j];
                if (c[j] < small)
                    small = c[j];
            }

        }
        for(int j=0;j<str.length;j++){
            if(c[j]==small){
                System.out.println("Smallest Palindrome: "+str[j]);
            }
            if(c[j]==big){
                System.out.println("Biggest Palindrome: "+str[j]);
            }
        }

    }

}
