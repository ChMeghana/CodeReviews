package Numbers;

import java.util.Scanner;

public class ReverseNumeber {
    int temp,rev;
    void reverse(int a){
        while(a!=0){
            temp=a%10;
            rev=rev*10+temp;
            a=a/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        ReverseNumeber obj=new ReverseNumeber();
        obj.reverse(n);
    }
}
