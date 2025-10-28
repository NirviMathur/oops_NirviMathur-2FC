// Base class
public class BankAccount {
    public int accountNumber;      
    protected String accountHolder; 
    private double balance;  

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Number (Public): " + accountNumber);
        System.out.println("Account Holder (Protected): " + accountHolder);
        System.out.println("Current Balance (via getter): ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest Earned: ₹" + interest);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 50000);
        System.out.println("=== Bank Account Details ===");
        acc1.displayAccountDetails();

        System.out.println();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        System.out.println("Updated Balance: ₹" + acc1.getBalance());

        System.out.println("\n=== Savings Account Details ===");
        SavingsAccount sav1 = new SavingsAccount(2001, "Bob", 80000, 5.0);
        sav1.displaySavingsDetails();
    }
}
