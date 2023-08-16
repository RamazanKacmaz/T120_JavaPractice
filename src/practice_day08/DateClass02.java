package practice_day08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateClass02 {
    public static void main(String[] args) {

        LocalDate an = LocalDate.of(2023,8,12);
        LocalDateTime futurDAte = calculateFuturdate(an,120).atStartOfDay();
        System.out.println("120 gun sonra " + futurDAte);
    }
    static LocalDate calculateFuturdate(LocalDate startDAte, long addDay){
        return startDAte.plus(addDay , ChronoUnit.DAYS);
    }


}
