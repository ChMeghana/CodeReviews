package strings;
import java.util.*;
import java.io.*;
public class StringPrograms {



        public static void countCharacters(String str) {
            System.out.println("=== Count Characters ===");
            System.out.println("Input: " + str);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count++;
            }
            System.out.println("Output: " + count);
            System.out.println();
        }

        public static void countPunctuations(String str) {
            System.out.println("Count Punctuations ");
            System.out.println("Input: " + str);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                    count++;
                }
            }
            System.out.println("Output: " + count);
            System.out.println();
        }

        public static void countVowelsAndConsonants(String str) {
            System.out.println("Count Vowels & Consonants ");
            System.out.println("Input: " + str);
            int vowels = 0, consonants = 0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowels++;
                    else consonants++;
                }
            }
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
            System.out.println();
        }

        public static void checkAnagram(String str1, String str2) {
            System.out.println(" Check Anagram ");
            System.out.println("Input1: " + str1 + ", Input2: " + str2);
            if(str1.length()!=str2.length()) {
                System.out.println("Output: Not Anagram");
                System.out.println();
                return;
            }
            int[] count = new int[256];
            for(int i=0;i<str1.length();i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            for(int i=0;i<256;i++) {
                if(count[i]!=0) {
                    System.out.println("Output: Not Anagram");
                    System.out.println();
                    return;
                }
            }
            System.out.println("Output: Anagram");
            System.out.println();
        }

        public static void divideString(String str, int n) {
            System.out.println("Divide String into N parts ");
            System.out.println("Input: " + str + ", N: " + n);
            int len = str.length()/n;
            for(int i=0;i<n;i++){
                int start = i*len;
                int end = (i==n-1)? str.length(): (i+1)*len;
                System.out.println(str.substring(start,end));
            }
            System.out.println();
        }

        public static void findAllSubsets(String str) {
            System.out.println("Find All Subsets of String ");
            System.out.println("Input: " + str);
            int n = str.length();
            for(int i=0;i<(1<<n);i++){
                String subset = "";
                for(int j=0;j<n;j++){
                    if((i & (1<<j))!=0){
                        subset += str.charAt(j);
                    }
                }
                System.out.println(subset);
            }
            System.out.println();
        }

        public static void longestRepeatingSequence(String str) {
            System.out.println(" Longest Repeating Sequence ");
            System.out.println("Input: " + str);
            int maxLen = 0;
            char maxChar = ' ';
            int count = 1;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)==str.charAt(i-1)) count++;
                else count=1;
                if(count>maxLen){
                    maxLen = count;
                    maxChar = str.charAt(i);
                }
            }
            System.out.println("Output: Char '" + maxChar + "' repeated " + maxLen + " times");
            System.out.println();
        }

        public static void findAllPermutations(String str) {
            System.out.println(" Find All Permutations ");
            System.out.println("Input: " + str);
            permute(str,0,str.length()-1);
            System.out.println();
        }

        private static void permute(String str, int l, int r){
            if(l==r){
                System.out.println(str);
            } else {
                for(int i=l;i<=r;i++){
                    str = swap(str,l,i);
                    permute(str,l+1,r);
                    str = swap(str,l,i);
                }
            }
        }

        private static String swap(String str,int i,int j){
            char[] arr = str.toCharArray();
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return new String(arr);
        }

        public static void removeWhiteSpaces(String str) {
            System.out.println(" Remove White Spaces ");
            System.out.println("Input: " + str);
            String result = "";
            for(int i=0;i<str.length();i++){
                if(!Character.isWhitespace(str.charAt(i))){
                    result += str.charAt(i);
                }
            }
            System.out.println("Output: " + result);
            System.out.println();
        }


        public static void lowerToUpper(String str) {
            System.out.println(" Lower to Upper & Vice Versa ");
            System.out.println("Input: " + str);
            String result = "";
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch >= 'a' && ch <= 'z') result += (char)(ch - 32);
                else if(ch >= 'A' && ch <= 'Z') result += (char)(ch + 32);
                else result += ch;
            }
            System.out.println("Output: " + result);
            System.out.println();
        }

        public static void replaceSpaces(String str, char ch) {
            System.out.println("Replace Spaces with Specific Char ");
            System.out.println("Input: " + str);
            String result = "";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' ') result += ch;
                else result += str.charAt(i);
            }
            System.out.println("Output: " + result);
            System.out.println();
        }

        public static void checkPalindrome(String str) {
            System.out.println(" Check Palindrome ");
            System.out.println("Input: " + str);
            int i=0, j=str.length()-1;
            boolean palin = true;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    palin=false;
                    break;
                }
                i++; j--;
            }
            if(palin)
                System.out.println("Output: " + "Palindrome");
            else
                System.out.println("Output: " + "Not Palindrome");
            System.out.println();
        }

        public static void checkRotation(String str1, String str2) {
            System.out.println("Check Rotation Between Strings");
            System.out.println("Input1: " + str1 + ", Input2: " + str2);
            if(str1.length()!=str2.length()){
                System.out.println("Output: Not Rotation");
                System.out.println();
                return;
            }
            String combined = str1 + str1;
            System.out.println("Output: " + (combined.contains(str2)?"Rotation":"Not Rotation"));
            System.out.println();
        }

        public static void maxMinOccurringChar(String str) {
            System.out.println(" Max & Min Occurring Char ===");
            System.out.println("Input: " + str);
            int[] freq = new int[256];
            for(int i=0;i<str.length();i++) freq[str.charAt(i)]++;
            int max=0, min=Integer.MAX_VALUE;
            char maxCh=' ', minCh=' ';
            for(int i=0;i<256;i++){
                if(freq[i]>0){
                    if(freq[i]>max){ max=freq[i]; maxCh=(char)i;}
                    if(freq[i]<min){ min=freq[i]; minCh=(char)i;}
                }
            }
            System.out.println("Max: '" + maxCh + "' = " + max + ", Min: '" + minCh + "' = " + min);
            System.out.println();
        }

        public static void reverseString(String str) {
            System.out.println("Reverse of String");
            System.out.println("Input: " + str);
            String rev = "";
            for(int i=str.length()-1;i>=0;i--) rev += str.charAt(i);
            System.out.println("Output: " + rev);
            System.out.println();
        }

        public static void duplicateChars(String str) {
            System.out.println("Duplicate Chars");
            System.out.println("Input: " + str);
            int[] freq = new int[256];
            for(int i=0;i<str.length();i++) freq[str.charAt(i)]++;
            for(int i=0;i<256;i++){
                if(freq[i]>1) System.out.println((char)i + " -> " + freq[i]);
            }
            System.out.println();
        }

        public static void duplicateWords(String str) {
            System.out.println(" Duplicate Words");
            System.out.println("Input: " + str);
            String[] words = str.split(" ");
            Map<String,Integer> map = new HashMap<>();
            for(String w: words){
                map.put(w,map.getOrDefault(w,0)+1);
            }
            for(String w: map.keySet()){
                if(map.get(w)>1) System.out.println(w + " : " + map.get(w));
            }
            System.out.println();
        }

        public static void frequencyOfChars(String str)
        {
            System.out.println("Frequency Of Characters");
            System.out.println("Input: " + str);
            char[] count=new char[26];
            for(int i=0;i<str.length();i++)
            {
                if((str.charAt(i))==' ')
                {
                    continue;
                }
                count[(int)(str.charAt(i)-'a')]++;
            }
            for( int ch: count)
            {
                System.out.println(((char)ch + 'a') + ": " + count[ch]);
            }
        }
    public static void largestAndSmallestWord(String str) {
        System.out.println("Largest and Smallest Word");
        String[] words = str.split(" ");
        String smallest = words[0], largest = words[0];
        for(String word : words) {
            if(word.length() < smallest.length()) smallest = word;
            if(word.length() > largest.length()) largest = word;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println();
    }
    public static void numberOfWordsInFile(String filePath) throws Exception {
        System.out.println("Number of Words in File");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        int count = 0;
        String line;
        while((line = br.readLine()) != null){
            count += line.split(" ").length;
        }
        System.out.println("Total words: " + count);
        System.out.println();
        br.close();
    }

    public static void separateChars(String str) {
        System.out.println("Separate Characters from String");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static void swapStringsWithoutThird(String a, String b) {
        System.out.println("Swap Strings Without Third Variable");
        System.out.println("Before Swap: a=" + a + ", b=" + b);
        a = a + b;
        b = a.substring(0,a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After Swap: a=" + a + ", b=" + b);
        System.out.println();
    }

    public static void smallestAndBiggestPalindrome(String str) {
        System.out.println("Smallest and Biggest Palindrome Words");
        String[] words = str.split(" ");
        String smallest = "", biggest = "";
        for(String w: words){
            if(isPalindrome(w)){
                if(smallest.equals("") || w.length() < smallest.length())
                    smallest = w;
                if(w.length() > biggest.length())
                    biggest = w;
            }
        }
        System.out.println("Smallest Palindrome: " + smallest);
        System.out.println("Biggest Palindrome: " + biggest);
        System.out.println();
    }

    private static boolean isPalindrome(String word){
        int i=0, j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void reverseWordByWord(String str) {
        System.out.println("Reverse String Word by Word");
        String[] words = str.split(" ");
        String result ="";
        for(int i=words.length-1;i>=0;i--){
            result += words[i] + " ";
        }
        System.out.println("Output: " + result.trim());
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
            String s1 = "hello world";
            String s2 = "dlrow olleh";
            String s3 = "listen";
            String s4 = "silent";
            String s5 = "aabbbcc";
            String s6 = "racecar";
            String s7 = "2025-10-13";

            countCharacters(s1);
            countPunctuations("Hello, World!");
            countVowelsAndConsonants(s1);
            checkAnagram(s3,s4);
            divideString(s1,3);
            findAllSubsets("abc");
            longestRepeatingSequence(s5);
            findAllPermutations("abc");
            removeWhiteSpaces(s1);
            lowerToUpper("Hello World");
            replaceSpaces("Hello World",'_');
            checkPalindrome(s6);
            checkRotation("abcd","cdab");
            maxMinOccurringChar(s5);
            reverseString(s1);
            duplicateChars(s5);
            duplicateWords("hello hello world world hello");
            frequencyOfChars("hi this is a program for finding frequency of characters");
        largestAndSmallestWord(s1);
//        mostRepeatedWordInFile("inputfile.txt");
        numberOfWordsInFile("inputfile.txt");
        separateChars("HELLO");
        swapStringsWithoutThird("Hello", "World");
        smallestAndBiggestPalindrome("the racecar went to the level of the radar station");
        reverseWordByWord("Java is fun to learn");
        }
    }
