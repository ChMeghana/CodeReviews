package org.example.exceptions;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String msg) { super(msg); }
}

class InactiveAccountException extends Exception {
    public InactiveAccountException(String msg) { super(msg); }
}

class BankAccount {
    boolean active = true;
    double balance = 5000;
    double dailyLimit = 1000;

    void withdraw(double amount) throws InsufficientFundsException, DailyLimitExceededException, InactiveAccountException {
        if (!active) throw new InactiveAccountException("Account inactive!");
        if (amount > dailyLimit) throw new DailyLimitExceededException("Daily limit exceeded!");
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds!");
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
    }
}

public class BankingTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(6000);
        } catch (InactiveAccountException e) {
            System.out.println("Handle inactive: " + e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println("Handle daily limit: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Handle insufficient funds: " + e.getMessage());
        }
    }
}
