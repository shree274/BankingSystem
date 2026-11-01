
public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, int customerId,
                          double balance, double overdraftLimit) {
        super(accountNumber, customerId, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal denied!");
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.printf("Current Balance: Rs. %.2f%n", balance);

            if (balance < 0) {
                System.out.printf(
                    "Overdraft used: Rs. %.2f%n", -balance);
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Current Account Details ---");
        super.displayDetails();
        System.out.printf("Overdraft Limit: Rs. %.2f%n",
                          overdraftLimit);
    }
}
