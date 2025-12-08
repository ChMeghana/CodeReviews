package Strings;

public class ReverseWordByWord {
    public static void main(String[] args) {
        String[] str = new String[]{"Hello","Good","Morning","World"};
        String[] str1 = new String[str.length];
        String reversed;
        for(int i=0; i<str.length; i++){
                reversed = new StringBuilder(str[i]).reverse().toString();
                System.out.println(reversed);
        }
    }
}
