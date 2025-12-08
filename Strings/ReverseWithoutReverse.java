package Strings;

class ReverseWithoutReverse {
    public static void main(String[] args) {
        String str = "Hello",rev="";

        for(int j=str.length()-1; j>=0; j--){

            rev=rev+str.charAt(j);
        }
        System.out.println(rev);
    }
}
