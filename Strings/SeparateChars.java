package Strings;

public class SeparateChars
{
    public static void main(String[] args){
        String str1="a1ppl?27e";
        int a=(int)'A';
        int b=(int)'z';
        String[] str = new String[str1.length()];
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>=a&&str1.charAt(i)<=b){
                str[i]=str1.charAt(i)+" ";
            }
            else{
                str[i]="";
            }

        }
        for(int j=0;j<str.length;j++){
            System.out.print(str[j]);
        }

    }
}
