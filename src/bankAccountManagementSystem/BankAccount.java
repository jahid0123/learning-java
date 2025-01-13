package bankAccountManagementSystem;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;



    private double interest;

    public BankAccount(int accountNumber, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest*balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public abstract void deposit(double amount) throws InvalidAmountException;

    public abstract void withdraw(double amount) throws InsufficientFundsException;



}
