package Basic;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
