
public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, int customerId, double balance) {
        super(accountNumber, customerId, balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Savings Account Details ---");
        super.displayDetails();
        System.out.println("Account Type: Savings Account");
    }
}
