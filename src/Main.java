import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello, World!");


        /*int age = 16;
        if (age<18)
            System.out.println("Under age");
        System.out.println("well come");*/

     /*   int ch = -10;
        switch (ch){
            case 1: ch++;
                    break;
            case 2: ch++;
                    break;
            default: ch++;
            case 3: ch++;
                    break;
            case 4: ch++;


        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer number to check even or odd: ");
        int num = scanner.nextInt();

        if (num%2==0){
            System.out.println(num+" is Even number.");
        }else {
            System.out.println(num+" is Odd number");
        }


    }

}