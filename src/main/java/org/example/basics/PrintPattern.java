package org.example.basics;

public class PrintPattern {
    void pattern1(){
        /*  Right Triangle Star Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        int i;
        for(i=0;i<5;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    void pattern2(){
        /*  Left Triangle Star Pattern
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
        for(int i=0;i<5;i++){
            for(int j=5-i-1; j>=0;j--){
                System.out.print(" " + " ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        PrintPattern obj1 = new PrintPattern();
        obj1.pattern1();
        obj1.pattern2();
    }
}
