package basic;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BasicPrgms {

    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    public static long factorial(int n)
    {
        if(n<0)
            return -1;
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            dp[i]=dp[i-1]*i;
        }
        return dp[n];
    }
    public static boolean isArmstrong(int n)
    {
        int length=(int) Math.floor(Math.log10(n));
        int sum=0,n1=n;
        while(n>0)
        {
            sum+=Math.pow(n%10, length);
            n=n/10;
        }
        if(sum==n1)
            return true;
        return false;
    }

    public static void randomNumber()
    {
        System.out.println(Math.random());
        System.out.println("Using Random Class");
        Random random=new Random();
        System.out.println(random.nextInt(10,1003));
        System.out.println("Using Thread Local Random");
        System.out.println(ThreadLocalRandom.current().nextFloat(10,12343));
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Prime

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number to check prime");
//        int n=sc.nextInt();
        System.out.println("IsPrime: "+ isPrime(151));
        System.out.println("IsPalindrome: "+ isPalindrome("absdfbsfd"));
        System.out.println("Factorial: "+ factorial(39));
        System.out.println("Is Armstrong: "+ isArmstrong(1643));
        System.out.println("Random Numbers");
        randomNumber();
        char c='a';
        System.out.println("ASCII value: "+(int)c);


        //Object Creation
        BasicPrgms object1=new BasicPrgms();
        Class cls=Class.forName("basic.BasicPrgms");
        BasicPrgms object2=(BasicPrgms) cls.newInstance();

        //Comparing Objects
        System.out.println("Object comparision: "+object1.equals(object2));
        int hash1=object1.hashCode();
        int hash2=object2.hashCode();
        System.out.println("Object comparision using HashCode: hash1-> "+ hash1+" hash2->"+ hash2);

    }
}
