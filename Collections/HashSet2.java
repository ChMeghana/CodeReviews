package Collections;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        HashSet<Character> hashSet1 = new HashSet<Character>();
        HashSet<Character> hashSet2 = new HashSet<Character>();

        for(int i=0;i<str1.length();i++){
            hashSet1.add(str1.charAt(i));
            hashSet2.add(str2.charAt(i));
        }
        if(hashSet1.equals(hashSet2)){
            System.out.println("Both strings form Anagram");
        }else{
            System.out.println("Both strings form Not Anagram");
        }
    }
}
