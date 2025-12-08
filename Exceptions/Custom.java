package Exceptions;


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
    double balance;
    boolean active;
    double dailyLimit;
    double withdrawnToday;

    BankAccount(double balance, boolean active, double dailyLimit) {
        this.balance = balance;
        this.active = active;
        this.dailyLimit = dailyLimit;
        this.withdrawnToday = 0;
    }

    void withdraw(double amount) throws InsufficientFundsException, DailyLimitExceededException, InactiveAccountException {
        if (!active) throw new InactiveAccountException("Account is inactive.");
        if (amount > balance) throw new InsufficientFundsException("Not enough balance.");
        if (withdrawnToday + amount > dailyLimit) throw new DailyLimitExceededException("Daily limit exceeded.");
        balance -= amount;
        withdrawnToday += amount;
        System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
    }
}

public class Custom {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000, true, 2000);

        double[] requests = {1000, 1500, 600};

        for (double amt : requests) {
            try {
                account.withdraw(amt);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            } catch (DailyLimitExceededException e) {
                System.out.println(e.getMessage());
            } catch (InactiveAccountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

