
import java.util.ArrayList;
import java.util.Scanner;

public class BankingManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> customers = new ArrayList<>();

    static int nextCustomerId = 1001;
    static int nextAccountNumber = 5001;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Open Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Loan");
            System.out.println("6. Display Account Details");
            System.out.println("7. Display All Customers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;

                case 2:
                    openAccount();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    withdrawMoney();
                    break;

                case 5:
                    applyLoan();
                    break;

                case 6:
                    displayAccountDetails();
                    break;

                case 7:
                    displayAllCustomers();
                    break;

                case 0:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid whole number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static double readDouble() {
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a valid amount: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    static Customer findCustomer(int customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                return c;
            }
        }
        return null;
    }

    static Customer findCustomerByAccount(int accountNumber) {
        for (Customer c : customers) {
            SavingsAccount a = c.getAccount();

            if (a != null && a.getAccountNumber() == accountNumber) {
                return c;
            }
        }
        return null;
    }

    static void addCustomer() {
        sc.nextLine();

        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine().trim();

        if (phone.isEmpty()) {
            System.out.println("Phone number cannot be empty.");
            return;
        }

        Customer customer =
                new Customer(nextCustomerId++, name, phone);

        customers.add(customer);

        System.out.println("Customer added successfully!");
        System.out.println("Customer ID: " + customer.getCustomerId());
    }

    static void openAccount() {
        if (customers.isEmpty()) {
            System.out.println("Please add a customer first.");
            return;
        }

        System.out.print("Enter Customer ID: ");
        int customerId = readInt();

        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.getAccount() != null) {
            System.out.println("Customer already has an account.");
            return;
        }

        System.out.print("Enter initial deposit: Rs. ");
        double balance = readDouble();

        if (balance < 0) {
            System.out.println("Initial deposit cannot be negative.");
            return;
        }

        // Constructor error fixed here:
        SavingsAccount account =
                new SavingsAccount(nextAccountNumber++, customerId, balance);

        customer.setAccount(account);

        System.out.println("Account opened successfully!");
        System.out.println("Account Number: "
                + account.getAccountNumber());
        System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
    }

    static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = readInt();

        Customer customer = findCustomerByAccount(accountNumber);

        if (customer == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: Rs. ");
        double amount = readDouble();

        customer.getAccount().deposit(amount);
    }

    static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = readInt();

        Customer customer = findCustomerByAccount(accountNumber);

        if (customer == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter withdrawal amount: Rs. ");
        double amount = readDouble();

        customer.getAccount().withdraw(amount);
    }

    static void applyLoan() {
        if (customers.isEmpty()) {
            System.out.println("Please add a customer first.");
            return;
        }

        System.out.print("Enter Customer ID: ");
        int customerId = readInt();

        Customer customer = findCustomer(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.getAccount() == null) {
            System.out.println("Please open an account first.");
            return;
        }

        System.out.print("Enter loan amount: Rs. ");
        double loanAmount = readDouble();

        if (loanAmount <= 0) {
            System.out.println("Loan amount must be greater than zero.");
            return;
        }

        System.out.println("Loan application submitted successfully!");
        System.out.println("Customer Name: " + customer.getName());
        System.out.printf("Requested Loan: Rs. %.2f%n", loanAmount);
        System.out.println("Status: Pending approval");
        System.out.println("Note: This is a demo; no actual loan is issued.");
    }

    static void displayAccountDetails() {
        System.out.print("Enter Account Number: ");
        int accountNumber = readInt();

        Customer customer = findCustomerByAccount(accountNumber);

        if (customer == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("\n--- Customer Details ---");
        customer.displayCustomer();

        customer.getAccount().displayDetails();
    }

    static void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers registered.");
            return;
        }

        System.out.println("\n===== ALL CUSTOMERS =====");

        for (Customer customer : customers) {
            System.out.println("-------------------------");
            customer.displayCustomer();
        }
    }
}
