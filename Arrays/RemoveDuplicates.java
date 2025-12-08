package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        int[] a = new int[]{1,1,2,2,2,3,3,4,5,5,5,2,6,9,1};

        int[] b= new int[a.length];
       // b[0]=a[0];
        int k=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for (int j=0;j<k;j++) {
                if (a[i] == b[j]) {
                    c = c + 1;
                    break;
                }
            }
                if (c==0) {
                    b[k] = a[i];
                    k++;
                }

        }
        for (int i=0;i<k;i++){
            System.out.println(b[i]);
        }

    }
}
