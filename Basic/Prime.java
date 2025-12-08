package Basic;

public class Prime {

    public static void main(String[] args) {
        System.out.println(1);
        int n=30;
        for(int i=2; i<=30;i++){
            int c=1;
            for (int j=2;j<=i;j++){
                if(i%j==0){
                    c=c+1;
                }

            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}