package Basic;

public class cons {
    int a,b,c;
    cons(){
    int a=10;
    int b=15;
    int c=20;
    }
    cons(int p,int q,int r){
        this.a=p;
        this.b=q;
        this.c=r;
    }
    public static void main(String[] args) {
        cons a=new cons();
        cons b=new cons(25,35,45);
        System.out.println(a.a);
        System.out.println(b.a);
    }
}
