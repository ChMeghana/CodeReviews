package org.example.basics;
import java.util.Scanner;

public class Fibonacci {
    void fibonacci(int num){
        int a=0,b=1,c;
        System.out.print("\n");
        System.out.print(a +" "+b);
        for (int i=2; i<num;++i){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args){
        Fibonacci fibObj = new Fibonacci();
        Scanner scanner =new Scanner(System.in);
        System.out.println("How many numbers of Fibonacci series do you wanna print? ");
        int num = scanner.nextInt();
        scanner.close();
        fibObj.fibonacci(num);
    }
}


