package practice_day08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH.mm.ss");
        String newFormatterTime = currentTime.format(formatter);
        System.out.println("Yeni zaman bicimi " + newFormatterTime);

    }
}
