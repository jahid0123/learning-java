import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");


        /*int age = 16;
        if (age<18)
            System.out.println("Under age");
        System.out.println("well come");*/

  /*      int ch = -10;
        switch (ch){
            case 1: ch++;
                    break;
            case 2: ch++;
                    break;
            case 3: ch++;
                    break;
            case 4: ch++;
                    break;
            default: ch++;

        }


               System.out.println(ch);*/

/*        for (int i=1; i<4; i++){
            if (i<2) continue;
            System.out.println(i);

        }*/


    /*    Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i<=num; i++){
            if (i<=1){
                System.out.print(i+ " ");
                if (i==1){
                    System.out.print(i+i+" ");
                }
            }else {
                System.out.print((i-1)+(i-2)+" ");
            }
        }*/

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int m = sc.nextInt();

        if (m <=1 ) {
            System.out.printf(m + " , is not prine number.");
        }else {
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    n++;
                }
            }

            if  (n == 0) {
                System.out.printf(m + " , is prine number.");

            } else {
                System.out.println(m + " , is not prime number.");

            }
        }
        
        sc.close();



    }
}