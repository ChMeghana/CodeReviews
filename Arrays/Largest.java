package Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] a={9,33,4,5,24,523,12};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);

    }

}
