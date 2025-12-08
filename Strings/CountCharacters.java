package Strings;

public class CountCharacters
{
    public  static void main(String[] args)
    {
        String s="Hola";
        int c=0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' '){
                c++;
            }
        }
        System.out.println("Number of Characters in the String:"+c);
    }
}
