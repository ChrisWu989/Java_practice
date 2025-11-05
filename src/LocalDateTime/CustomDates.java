package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CustomDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate cusstomlocalDate = LocalDate.of(2020, 02, 02);

        localDate.plusDays(1);
        localDate.minusYears(1);
        int year = localDate.getYear();

        System.out.println(localDate);

        // Time

        LocalTime time = LocalTime.now();
        LocalTime customlocalTime = LocalTime.of(10,10);

        customlocalTime.plusHours(1);

        System.out.println(time);

        // DateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        
        String datetime = "2025-10-31T23:26";
        LocalDateTime customlocalDateTime = LocalDateTime.parse(datetime);
        System.out.println(localDateTime);
    }
}
