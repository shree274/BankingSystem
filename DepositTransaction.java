public class DepositTransaction extends Transaction {

    public DepositTransaction(int transactionId,
                              int accountNumber,
                              double amount) {
        super(transactionId, accountNumber, amount);
    }

    @Override
    public String getTransactionType() {
        return "Deposit";
    }
}