package classNineteen;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index for a fibonacci number: ");
        long num = scanner.nextInt();

        System.out.println("The Fibonacci Service: ");
        for (long i=0; i<num; i++ ) {
            System.out.print(fib(i)+" ");

        }
    }
    public static long fib(long n){
        if (n <= 1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
