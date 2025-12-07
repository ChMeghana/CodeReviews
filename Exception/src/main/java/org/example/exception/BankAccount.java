package org.example.exception;

// Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String message) {
        super(message);
    }
}

class InactiveAccountException extends Exception {
    public InactiveAccountException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;
    private boolean isActive;
    private double dailyLimit = 5000;
    private double withdrawnToday = 0;

    public BankAccount(double balance, boolean isActive) {
        this.balance = balance;
        this.isActive = isActive;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException, DailyLimitExceededException, InactiveAccountException {

        if (!isActive) {
            throw new InactiveAccountException("Account is inactive. Cannot withdraw.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }

        if (withdrawnToday + amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily withdrawal limit exceeded.");
        }

        balance -= amount;
        withdrawnToday += amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}




