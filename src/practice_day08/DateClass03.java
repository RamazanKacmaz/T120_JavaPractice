package practice_day08;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateClass03 {

    public static void main(String[] args) {
        LocalDateTime dogumyili = LocalDateTime.of(2011,5,8,12,00);
        LocalDateTime suan = LocalDateTime.now();

        Duration duration = Duration.between(dogumyili, suan);

        long day = duration.toDays();
        long hour = duration.toHours();
        long minute = duration.toMinutesPart();
        long secund = duration.toSecondsPart();
        System.out.println(day + " " + hour + " " + minute + " " + secund);
    }


}
