package Arrays;

public class OddEven
{
    public static  void main(String[] args)
    {
        int[ ] a= new int[]{17,18,22,23,2,36,39,42,51,57,59,25,61,99,1};
        int[]b= new int[a.length];
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                b[c]=a[i];
                c=c+1;
            }
        }
        for(int i=c;i<a.length;i++){
            if(a[i]%2!=0)
            {
                b[c]=a[i];
                c=c+1;
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.println(b[i]);
        }
    }
}
