package chainederrors;

import java.io.FileNotFoundException;

public class SystemInit {
    public static void main(String[] args) {
        try {
            new Initializer().start();

        } catch (SystemInitializationException e) {
            System.out.println("Top Layer Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
