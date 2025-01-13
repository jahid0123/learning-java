package bankAccountManagementSystem;

public class CurrentAccount extends BankAccount  {

    private final double interestRate;

    public CurrentAccount(int accountNumber, double accountBalance, double interestRate){

        super(accountNumber, accountBalance);
        this.interestRate = interestRate;
    }


    @Override
    public void deposit(double amount) throws InvalidAmountException{
        if (amount<=0){
            throw new InvalidAmountException("Deposit amount must be grater then 0");
        }else {
            setAccountBalance(getAccountBalance()+amount);
        }
    }

    @Override
    public void withdrawal(double amount) throws InsufficientFundsException{
        if (amount>getAccountBalance()){
            throw new InsufficientFundsException("Insufficient balance");
        }
    }


    @Override
    public double interestAmount(){
        return getAccountBalance()*interestRate/100;
    }

    @Override
    public String toString() {
        return "Account Number: "+getAccountNumber()+
                "\nAccount Balance: "+getAccountBalance()
                +"\ninterestRate=" + interestRate;
    }

}
