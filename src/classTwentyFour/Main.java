package classTwentyFour;

import classTwentyFour.Test.Employee;
import classTwentyFour.Test.Employee1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Rahul", LocalDate.of(1994,1,1),20000.0, "Tilak Nagar, New Delhi");
        Employee1 employee1 = new Employee1("Raman", LocalDate.of(2000,1,1),15000.0, "Hari Nagar, New Delhi");
        Employee1 employee2 = new Employee1("Rohit", LocalDate.of(1999,1,1),19000.0, "Subash Nagar, New Delhi");

        System.out.print("Name\tYear of Joining\tAddress\n");
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());



    }

}
