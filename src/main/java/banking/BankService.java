package banking;

class BankService {

    private double balance = 1000;
    private double dailyLimit = 1500;
    private boolean active = true;

    public void withdraw(double amount) throws
            InsufficientFundsException,
            DailyLimitExceededException,
            InactiveAccountException {

        if (!active) {
            throw new InactiveAccountException("Account is not active.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance.");
        }
        if (amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily limit exceeded.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}
