package Arrays;


public class CopyArray {
    public static void main(String[] args) {
        int[] a= new int[] {1,2,3,4,5} ;

        int[] b= new int[10];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }

    }
}
