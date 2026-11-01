Banking Management System

Student Details
 Name: Jeyashree
 Roll Number:717825L322

Problem Statement
   To develop a menu-driven Banking Management System using Java that manages customer information, savings accounts, current accounts, deposits, withdrawals, loan applications, and banking transactions. The system validates transactions and displays account and customer details.

Project Overview
     The Banking Management System is a console-based Java application developed using Object-Oriented Programming (OOP) concepts. It provides basic banking operations through a menu-driven interface and demonstrates inheritance, encapsulation, and method overriding.

Features
- Add new customers.
- Open savings and current accounts.
- Deposit money.
- Withdraw money.
- Apply for loans.
- Display account details.
- Display all registered customers.
- Validate transaction amounts and account balances.

 Technologies Used
- Java
- Java Collections Framework
- Eclipse IDE
- JDK

Project Structure
BankingSystem/
├── src/
│   ├── BankAccount.java
│   ├── BankingManagementSystem.java
│   ├── CurrentAccount.java
│   ├── Customer.java
│   ├── DepositTransaction.java
│   ├── Loan.java
│   ├── SavingsAccount.java
│   ├── Transaction.java
│   └── WithdrawalTransaction.java
└── README.md

 Description of Classes
 
BankAccount.java - Defines common account details and banking operations. 
BankingManagementSystem.java - Contains the main method and menu-driven operations. 
CurrentAccount.java - Implements current account functionality and overdraft limits. 
Customer.java - Stores customer information and account details. 
DepositTransaction.java - Handles deposit transactions. 
Loan.java - Manages loan-related information and applications. 
SavingsAccount.java -  Implements savings account functionality. 
Transaction.java -Defines common transaction properties and behavior. 
WithdrawalTransaction.java - Handles withdrawal transactions. 

 Requirements
- Java Development Kit (JDK 8 or later)
- Eclipse IDE or any Java-compatible IDE

 How to Compile and Run

Using Eclipse IDE
1. Open Eclipse IDE.
2. Open the BankingSystem project.
3. Expand the src folder.
4. Open BankingManagementSystem.java.
5. Right-click the file.
6. Select Run As → Java Application.

 Using Command Prompt
1. Open Command Prompt.
2. Navigate to the directory containing the Java source files.
3. Compile the files using:
javac *.java


4. Run the application using:
java BankingManagementSystem

 Sample Output
===== BANKING MANAGEMENT SYSTEM =====

1. Add Customer
2. Open Account
3. Deposit Money
4. Withdraw Money
5. Apply Loan
6. Display Account Details
7. Display All Customers
0. Exit
Enter your choice:

Limitations
- Data may be lost when the application closes if database storage is not implemented.
- Loan applications may be simulated and do not represent actual loan approval.
- This application is intended for educational purposes.

 Conclusion
   The Banking Management System demonstrates the implementation of basic banking operations using Java and Object-Oriented Programming concepts. It provides a simple and structured way to manage customers, accounts, transactions, and loan applications.
