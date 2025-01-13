package bankAccountManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<BankAccount> readAccounts (String filePath) throws IOException {

        List<BankAccount> accounts = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                String[] details = line.split(",");
                int accountNumber = Integer.parseInt(details[0].trim());

                String accountType = details[1].trim();
                double balance =Double.parseDouble(details[2].trim());
                double interest = Double.parseDouble(details[3].trim());

                if (accountType.equalsIgnoreCase("Savings")){
                    accounts.add(new SavingsAccount(accountNumber, accountType ,balance, interest));
                }
            }

        }catch (IOException ignored){

        }

        return accounts;
    }

    public static void main(String[] args) {



       try {
           String inputFilePath = "C:\\GIT\\learning-java\\Account.cvs";
           String outputFilePath = "C:\\GIT\\learning-java\\Accounts_update";

           List<BankAccount> accounts = new ArrayList<>()
       }
    }
}
