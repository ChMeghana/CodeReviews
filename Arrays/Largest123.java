package Arrays;

public class Largest123
{
    public static void main(String[] args){
        int[] a={9,33,4,5,24,523,12};
        int first=0,second=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
            }else if(a[i]>second){
                second=a[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
