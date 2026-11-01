
public class BankAccount {
    protected int accountNumber;
    protected int customerId;
    protected double balance;

    public BankAccount(int accountNumber, int customerId, double balance) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.printf("Current Balance: Rs. %.2f%n", balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.printf("Current Balance: Rs. %.2f%n", balance);
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer ID: " + customerId);
        System.out.printf("Balance: Rs. %.2f%n", balance);
    }
}
