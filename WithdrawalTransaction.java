public class WithdrawalTransaction extends Transaction {
    public WithdrawalTransaction(int transactionId, int accountNumber, double amount) {
        super(transactionId, accountNumber, amount);
    }

    @Override
    public String getTransactionType() {
        return "Withdrawal";
    }
}
