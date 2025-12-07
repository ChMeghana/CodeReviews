package org.example.exception;

public class Customexceptions {

        public static void main(String[] args) {

            BankAccount account = new BankAccount(3000, true);

            try {
                account.withdraw(6000);  // test daily limit
            }
            catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (DailyLimitExceededException e) {
                System.out.println("Warning: " + e.getMessage());
            }
            catch (InactiveAccountException e) {
                System.out.println("Alert: " + e.getMessage());
            }
            finally {
                System.out.println("Withdrawal attempt finished.");
            }
        }
    }

