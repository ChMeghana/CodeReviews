package Strings;

public class CountPunctuations
{
    public static  void main(String[] args)
    {
        String s= "S_4j.!y/,'1?;;";
        int c=0;
        for (int i = 0; i<s.length();i++){
            if(s.charAt(i)=='-' || s.charAt(i)=='.' || s.charAt(i)==';' || s.charAt(i)=='/' || s.charAt(i)=='_' || s.charAt(i)=='!' || s.charAt(i)=='?' || s.charAt(i)==',' || s.charAt(i)=='\''){
                c++;
            }

        }
        System.out.println("Number of Punctuations in the string: "+c);

    }
}
