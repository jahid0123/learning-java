import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello, World!");


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


/*        Scanner scanner = new Scanner(System.in);
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

      /*  int[] array = {1, 2, 5, 4, 3, 6, 9, 8};
        int min = array[0];
        int max = array[0];
        for (int i: array){

            if (min>i)
                min = i;

            if (max<i)
                max =i;
        }

        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);*/

        Scanner sc=new Scanner(System.in);

while (true){
    System.out.println("1. Grading System\n2. Exit");
    System.out.print("Enter your choice: ");
    int i = sc.nextInt();
    if (i==1){
        System.out.print("Enter your mark check grade: ");
        int marks = sc.nextInt();
        if (marks<0 || marks>100){
            System.out.println("You enter invalid number. Please enter valid number.");
        }else {
            if (marks>80)
                System.out.println("You got A+");
            else if (marks>70)
                System.out.println("You got A");
            else if (marks>60)
                System.out.println("You got A-");
            else if (marks>50)
                System.out.println("You got B");
            else if (marks>40)
                System.out.println("You got C");
            else if (marks>32)
                System.out.println("You got D");
            else
                System.out.println("Sorry you are fail. You got F");
        }
    }else
        break;
}


    }
}