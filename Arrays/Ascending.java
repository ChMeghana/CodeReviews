package Arrays;

public class Ascending {
    public static void main(String[] args) {

        int[] a= {2,4,3,1,6,5};
        for (int j=0;j<a.length;j++){

            for(int i=j;i<a.length;i++){
                int t=0;
                if(a[j]>a[i]){
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
