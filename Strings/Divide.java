package Strings;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of parts you want divide the string");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the string");
        String str1 = sc.next();
        char[] arr1 = str1.toCharArray();
        int i=0;
        for(int j=0;j<n;j++){
            int k=i;
            for(int l=0;l<n-1;l++){
                System.out.print(arr1[k]);
                i++;
                k++;
            }
            System.out.println();
        }
    }
}


