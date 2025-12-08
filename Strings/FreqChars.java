package Strings;

public class FreqChars {
    public static void main(String[] args) {
        String str = "abcdefgaabbfggg";
        boolean[] v = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            if (v[str.charAt(i)]==true) {
                continue;
            }
            for (int j = i; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    v[str.charAt(i)]=true;
                }
            }
            System.out.println("Count of "+ str.charAt(i)+" is "+ count);
        }
    }
}
