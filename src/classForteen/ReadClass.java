package classForteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadClass {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        Scanner scanner1 = new Scanner(new File("scores.txt"));

        while (scanner1.hasNext()){
            System.out.println(scanner1.nextLine());
        }
    }
}
