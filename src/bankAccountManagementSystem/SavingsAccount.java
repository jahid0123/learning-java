package bankAccountManagementSystem;

public class SavingsAccount extends BankAccount{

    private final String ACCOUNT_TYPE = "Savings";

    public SavingsAccount(int accountNumber, String accHolderName, double balance,  double interest) {
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
            throw new InsufficientFundsException("Insufficient balance");
    }


}
