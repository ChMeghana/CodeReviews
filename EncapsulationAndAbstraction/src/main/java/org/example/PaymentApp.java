package org.example;

// PaymentMethod.java (Interface)
interface PaymentMethod {
    void processPayment(double amount);
}

// CreditCard.java
class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPal.java
class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// PaymentApp.java (Main to run)
public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        creditCard.processPayment(250.0);
        payPal.processPayment(500.0);
    }
}
