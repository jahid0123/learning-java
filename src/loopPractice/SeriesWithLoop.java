package loopPractice;

import java.util.Scanner;

public class SeriesWithLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many number of series you have: ");
        int t=in.nextInt();
        for(int i=0; i<t; i++){
            System.out.print("Enter value of A: ");
            int a = in.nextInt();
            System.out.print("Enter value of B: ");
            int b = in.nextInt();
            System.out.print("Enter how many element you need in your series (n): ");
            int n = in.nextInt();

            int sum = a;
            for(int j = 0; j<n; j++){
                sum += (int)(Math.pow(2, j)*b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
