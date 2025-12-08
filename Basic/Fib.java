package Basic;

public class Fib {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=1;
        System.out.println(a);
        System.out.println(b);

        while(n<=30){
            n=a+b;
            System.out.println(n);
            a=b;
            b=n;

        }
    }
}