package Strings;

import java.util.Arrays;
import java.util.Locale;

import static java.lang.System.exit;

public class Anagram
{
    public static  void main(String[] args)
    {
        String str1 = "CaB";
        String str2 = "abc";
        if(str1.length() != str2.length()){
            System.out.println("Strings are not Anagram");
            exit(0);
        }

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both strings form Anagram");
        }else System.out.println("Both strings doesnt form Anagram");

    }
}
