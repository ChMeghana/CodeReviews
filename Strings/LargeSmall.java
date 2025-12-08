package Strings;

public class LargeSmall {
    public static void main(String[] args) {
        String[] str = new String[]{"apple","batch","team","Ganesh","hat"};
        int mai=0,mii=0,max=0,min=256;

        for(int i=0;i<str.length;i++){
            if(str[i].length()>max){
                max=str[i].length();
                mai=i;
            }
            if(str[i].length()<min){
                min=str[i].length();
                mii=i;
            }
        }
        System.out.println("Longest String: "+str[mai]);
        System.out.println("Smallest String: "+str[mii]);
    }
}
