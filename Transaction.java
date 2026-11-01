import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Transaction {
    private int transactionId;
    private int accountNumber;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(int transactionId, int accountNumber, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public int getTransactionId() { return transactionId; }
    public int getAccountNumber() { return accountNumber; }
    public double getAmount() { return amount; }
    public abstract String getTransactionType();

    public void printReceipt(double balance) {
        System.out.println("\n------ TRANSACTION RECEIPT ------");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Type           : " + getTransactionType());
        System.out.printf("Amount         : Rs. %.2f%n", amount);
        System.out.println("Date and Time  : " +
            dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.printf("New Balance    : Rs. %.2f%n", balance);
        System.out.println("---------------------------------");
    }
}
