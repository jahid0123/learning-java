package regularPractice;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of "+n+" is "+ factorial(n));
    }
    public static long factorial (int n){

        if (n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
