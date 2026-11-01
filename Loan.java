public class Loan {
    private int loanId;
    private int customerId;
    private double amount;
    private int monthlyIncome;
    private boolean approved;

    public Loan(int loanId, int customerId, double amount, int monthlyIncome) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.amount = amount;
        this.monthlyIncome = monthlyIncome;
        this.approved = monthlyIncome >= 15000 && amount > 0
                && amount <= monthlyIncome * 10.0;
    }

    public boolean isApproved() { return approved; }

    public void displayResult() {
        System.out.println("\n---------- LOAN RESULT ----------");
        System.out.println("Loan ID       : " + loanId);
        System.out.println("Customer ID   : " + customerId);
        System.out.printf("Loan Amount   : Rs. %.2f%n", amount);
        System.out.println("Monthly Income: Rs. " + monthlyIncome);
        System.out.println("Status        : " + (approved ? "APPROVED" : "REJECTED"));
        if (!approved) {
            System.out.println("Reason        : Income must be at least Rs. 15000, and loan amount");
            System.out.println("                must not exceed 10 times monthly income.");
        }
        System.out.println("---------------------------------");
    }
}
