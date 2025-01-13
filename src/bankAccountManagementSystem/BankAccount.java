package bankAccountManagementSystem;

public abstract class BankAccount {

    private int accountNumber;
    private double accountBalance;


    public BankAccount (int accountNumber, double accountBalance){

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public abstract void deposit(double amount) throws InvalidAmountException;

    public abstract void withdrawal(double amount) throws InsufficientFundsException;

    public abstract double interestAmount();
}
