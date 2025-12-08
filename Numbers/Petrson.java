package Numbers;

public class Petrson {
    public static void main(String[] args) {
        int num=145;
        int t=num;
        int n,sum=0;
        while(num!=0){
            n=num%10;
            int factorial=1;
            for(int j=n;j>=1;j--){
                factorial=factorial*j;
            }

            sum=sum+factorial;
            num=num/10;
        }

        if(sum==t){
            System.out.println(sum+" is a petrson");
        }else {
            System.out.println(sum+" is not a petrson");
        }

    }
}
