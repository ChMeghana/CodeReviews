package Numbers;

import java.util.Scanner;

public class Automorphic {
    public static void main(String args[]) {
        int n = 25;
        int temp;
        int c1 = 0, c2 = 0, rev, a = n;
        int b = n * n;
        int auto = 0, d = b;
        while (a != 0) {
            c1 = c1 + 1;
            a = a / 10;

        }
        while (c1 > 0) {
            temp = d % 10;
            auto = auto * 10 + temp;
            d = d / 10;
            c1=c1-1;
        }

        String s=Integer.toString(auto);
        String s1 =new StringBuilder(s).reverse().toString();
        int a1= Integer.parseInt(s1);
        if(a1==n){
            System.out.println("it is Automorphic Number");
        }else {
            System.out.println("it is not Automorphic Number");
        }
    }
}