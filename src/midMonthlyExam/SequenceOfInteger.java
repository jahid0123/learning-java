package midMonthlyExam;

import java.util.Scanner;

public class SequenceOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.print("Enter integers (a negative integer will stop the input): ");

       
        while (true) {
            number = scanner.nextInt();

            if (number < 0) {
                break; 
            }

            sum += number; 
        }

        System.out.println("The sum of the positive integers is: " + sum);
        scanner.close();
    }
}