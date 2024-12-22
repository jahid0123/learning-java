package classThirteen.tryCatch;
import java.util.Scanner;

public class FinallyClause {
    public static void main(String[] args) {

        // simple try..catch..finally
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println(1/0);
        }catch (Exception e){
            System.out.printf("Exception occurred exception is %s", e.getMessage());
        }finally {
            if (scanner != null){
                scanner.close();
            }
            System.out.println("This block will always execute.");
        }
    }
}
