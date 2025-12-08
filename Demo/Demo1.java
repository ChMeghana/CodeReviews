package Demo;

public class Demo1 {

public static void method() {

    int age = 20;
    try {
        if (age <= 18) {
            throw new myexception("Your age is less than 18");
        }
        System.out.println("you are eligible "+(age+10));
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
public static void main(String[] args) {
    method();

}
}
