package org.example.interfaces;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Auditable {}

@Auditable
class Order2 {}

public class I9AnnotationTest {
    public static void main(String[] args) {
        if (Order2.class.isAnnotationPresent(Auditable.class))
            System.out.println("Audit enabled");
    }
}
