package bankAccountManagementSystem;

public class CurrentAccount extends BankAccount {

    private final String ACCOUNT_TYPE = "Current";

    public CurrentAccount(int accountNumber, double balance, String accHolderName, double interest) {
        super(accountNumber, balance, accHolderName, interest);
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount<=0)
            throw new InvalidAmountException("Deposit amount must greater then 0");
        else
            setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {

        if (getBalance()>=amount)
            setBalance(getBalance()-amount);
        else
            throw new InsufficientFundsException("Insufficient Balance");
    }
}
