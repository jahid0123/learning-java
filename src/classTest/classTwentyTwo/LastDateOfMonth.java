package classTest.classTwentyTwo;

import java.time.LocalDate;
import java.time.YearMonth;

public class LastDateOfMonth {
    public static void main(String[] args) {

        YearMonth yearMonth = YearMonth.now();
        LocalDate lastDate = yearMonth.atEndOfMonth();

        System.out.println(lastDate);
    }
}
