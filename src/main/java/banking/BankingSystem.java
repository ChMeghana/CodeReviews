package banking;

public class BankingSystem {
    public static void main(String[] args) {
        BankService service = new BankService();

        try {
            service.withdraw(2000);

        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds: " + e.getMessage());

        } catch (DailyLimitExceededException e) {
            System.out.println("Daily Limit Error: " + e.getMessage());

        } catch (InactiveAccountException e) {
            System.out.println("Inactive Account: " + e.getMessage());
        }
    }
}
