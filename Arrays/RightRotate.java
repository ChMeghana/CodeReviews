package Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] a = {2,3,9,10,12,5};
        int last= a[a.length-1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;


        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

    }
}
