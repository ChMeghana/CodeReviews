package Arrays;

public class Smallest12
{
    public static void main(String[] args){
        int[] a={9,33,4,5,24,523,12};
        int first=100,second=100;
        for(int i=0;i<a.length;i++){
            if(a[i]<first){
                second=first;
                first=a[i];
            }
            else if(a[i]<second){
                second=a[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
