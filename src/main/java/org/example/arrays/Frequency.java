package org.example.arrays;

public class Frequency {
    public static void main(String[] args){
        int[] array3 = {1, 2, 3, 5, 6, 3, 4, 8, 3, 6, 1, 4, 0};
        int[] arrayT = new int[array3.length]; //1,2,3,5,6

        boolean flag = true;
        System.out.println("Number | Frequency");
        int countK=0;

        for(int i=0;i<array3.length;i++) {
            int count = 1;
            if(i!=0) {
                for (int k = 0; k < array3.length; k++) {
                    if (arrayT[k] == array3[i]) {
                        flag = false;
                    }
                }
            }
            if(flag){
                for (int j = i + 1; j < array3.length; j++) {
                    if (array3[i] == array3[j]) {
                        count++;
                    }
                }
                arrayT[countK]=array3[i];
//                System.out.println(countK);
//                for(int x:arrayT)
//                System.out.print(x+" ");
//                System.out.println();
                countK++;
                System.out.println("  " + array3[i] + "          " + count);
            }
            flag=true;
        }
    }
}
