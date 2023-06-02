package algorithms;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // yyyy/MM/dd pattern
        LocalDate localDate1 = LocalDate.parse("1999-06-01");
        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate1); // 2020-05-12
        System.out.println(localDate2);
        System.out.println(Period.between(localDate1,localDate2).getYears());
        }
}
