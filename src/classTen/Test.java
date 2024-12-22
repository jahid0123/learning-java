package classTen;

import java.util.Scanner;

public class Test{

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your mid-exam marks: ");
        double mark1 = input.nextDouble();
        System.out.print("Enter your monthly-exam marks: ");
        double mark2 = input.nextDouble();

        double calculateMidMarks = mark1*0.2;
        double calculateMonMarks = mark2*0.8;

        double sumMark = calculateMidMarks + calculateMonMarks;


        if (sumMark>29){
            System.out.println("Congrats you are pass🤩🤩\nYour mark is: "+sumMark);
        }else {
            System.out.println("Sorry you are fail😥😥\nYour mark is: "+sumMark);
        }

    }
}
