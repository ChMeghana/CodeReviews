package Arrays;

public class Elements
{
    public static void main(String[] args)
    {
        int[] a=new int[]{2,4,5,6,9,7};
        System.out.println("Elements in Array");
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.println("Elements in Array Reverese Order");
        for(int j=a.length-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.println("Elements in Array Even indeces");
        for(int j=0;j<a.length;){
            System.out.print(a[j]+" ");
            j=j+2;
        }


    }
}
