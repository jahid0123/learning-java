package bankAccountManagementSystem;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        try(Scanner sc = new Scanner(new File("C:\\GIT\\learning-java\\Account.cvs"))) {
            while (sc.hasNextLine()){
                String[] data = sc.nextLine().split(",");
                int accountNumber = Integer.parseInt(data[0]);
                String accountType = data[1];
                double accountBalance = Double.parseDouble(data[2]);
                double interestRate = Double.parseDouble(data[3]);

                if (accountType.equalsIgnoreCase("Savings")){
                    accounts.add(new SavingsAccount(accountNumber, accountBalance, interestRate));
                } else if(accountType.equalsIgnoreCase("Current")){
                    accounts.add(new CurrentAccount(accountNumber, accountBalance, interestRate));
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try (PrintWriter writer= new PrintWriter("C:\\GIT\\learning-java\\accounts_update.csv")){
             for (BankAccount account: accounts) {
                 account.deposit(500);
                 writer.println(account);
            }
        }catch (FileNotFoundException | InvalidAmountException e){
            System.out.println(e.getMessage());
        }
    }
}
