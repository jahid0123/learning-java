package atmMachine;

import java.util.Scanner;

public class ATM {

    double balance;
    final int PIN = 5674;
    Scanner sc = new Scanner(System.in);

    public void checkPin(){
        System.out.print("Enter your pin: ");
        int enteredPin = sc.nextInt();

        if (PIN == enteredPin){
            menu();
        }else {
            System.out.println("Enter a valid pin!");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");

        int opt = sc.nextInt();

        if (opt==1){
            checkBalance();
        }else if (opt==2){
            withdrawMoney();
        }else if (opt==3){
            depositMoney();
        }else if (opt==4)
            return;
        else {
            System.out.println("Enter a valid choice!");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("Account balance is: " + balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount<=0){
            System.out.println("Enter valid amount");
            menu();
        } else if (amount>balance) {
            System.out.println("Insufficient balance");
            menu();
        }else {
           balance = balance - amount;
            System.out.println("Amount withdraw successfully");
           menu();
        }
    }

    public void depositMoney(){
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount<=0){
            System.out.println("Amount must be grater then 0");
            menu();
        }else {
            balance = balance + amount;
            System.out.println("Deposit successfully");
            menu();
        }
    }


}
