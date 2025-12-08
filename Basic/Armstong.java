package Basic;

public class Armstong {
    public static void main(String[] args) {
        int n1=1634,n= 1634;
        //int n1=1634;
        String s=Integer.toString(n);
        int sum=0;
        int l = s.length();
        int a =0;
        while(l>0){
            a=n%10;
            sum=sum+(int)Math.pow(a, s.length()); ;
            n=n/10;
            l--;

        }
        if (n1==sum){
            System.out.println(n1 + " is Armstong Number");
        }
        else{
            System.out.println(n1 + " is not Armstong Number");
        }
    }
}
