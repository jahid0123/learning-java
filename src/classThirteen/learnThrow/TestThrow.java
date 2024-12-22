package classThirteen.learnThrow;

import java.io.StringReader;
import java.util.Scanner;

public class TestThrow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TestThrow testThrow = new TestThrow();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double v = testThrow.divideTwoNumber(num1, num2);
        //double v1 =testThrow.divideTwoNumber(nu, 0);

        System.out.println(v);
        //System.out.println(v1);

        double random = Math.random()*100;
        System.out.println(random);

        try {
            int[] arr = {1, 2, 3};
            int randomElement = testThrow.accessRandomElement(arr);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Here is the exception "+ e.getMessage());
        }
    }

    public double divideTwoNumber(double num1, double num2){
        double v = 0;
                try {
            v = num1/num2;
        }catch (Exception e){
            throw new ArithmeticException("You are giving wrong input" +
                    " that's why error occurred that is "+ e.getMessage());
        }
        return v;
    }

    public int accessRandomElement(int[] arr) throws ArrayIndexOutOfBoundsException{
        try {
            double random = Math.random()*100;
            System.out.println(random);
            return arr[(int) random];
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException(e.getMessage()+"!");
        }
    }
}
