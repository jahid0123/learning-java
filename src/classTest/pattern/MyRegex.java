package classTest.pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    private static final String IP_PATTERN =
                    "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

    private final Pattern pattern;

    public MyRegex() {
        this.pattern = Pattern.compile(IP_PATTERN);
    }

    public boolean validate(String ip){
        if (ip == null){
            return false;
        }
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        MyRegex myRegex = new MyRegex();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your IP address: ");
        String ip = scanner.nextLine();

        boolean valid = myRegex.validate(ip);

        if (valid){
            System.out.println("Your IP address is valid.");
        }else {
            System.out.println("Your IP address is not valid.");
        }


    }
}
