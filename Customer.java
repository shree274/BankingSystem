
public class Customer {
    private int customerId;
    private String name;
    private String phone;
    private SavingsAccount account;

    public Customer(int customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.account = null;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public SavingsAccount getAccount() {
        return account;
    }

    public void setAccount(SavingsAccount account) {
        this.account = account;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

        if (account == null) {
            System.out.println("Account: Not opened");
        } else {
            System.out.println("Account Number: "
                    + account.getAccountNumber());
        }
    }
}
