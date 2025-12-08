package Strings;

import java.util.Locale;

public class CountVC
{
    public static  void main(String[] args)
    {
        String s="AbcdEdfghijO";
        s=s.toLowerCase();
        int cv=0,cc=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i'){
               cv++;
           }
           else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
               cc++;
           }
        }
        System.out.println("Number of vowels in the String: "+cv);
        System.out.println("Number of consonants in the String: "+cc);
    }
}
