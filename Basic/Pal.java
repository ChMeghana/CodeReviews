package Basic;

import java.lang.*;
public class Pal {

    public static void main(String[] args) {
        String a= "abcdcba";


        String c="";
        for(int i=a.length()-1;i>=0;i--){

            c= c + a.charAt(i);
        }
        if(a.equals(c)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

}
