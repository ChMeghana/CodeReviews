package basic;

import java.util.*;

public class Fibanocci {
    public static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        int[] fibdp=new int[n+1];
        fibdp[0]=0;
        fibdp[1]=1;
        for(int i=2;i<=n;i++)
        {
            fibdp[i]=fibdp[i-1]+fibdp[i-2];
        }
        return fibdp[n];
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.println(fibonacci(i));

    }
}
