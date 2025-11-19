package zJavaCertPractice.Nov18;

import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1)); // Nov 1 9PM
        System.out.println(date); 

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1)); 
        System.out.println(date); // Nov 1 10pm

        LocalTime now = LocalTime.now();
        LocalTime gameStart = LocalTime.of(10, 15);
        long timeConsumed = 0;
        long timeToStart = 0;
        if(now.isAfter(gameStart)){
            timeConsumed = gameStart.until(now, ChronoUnit.HOURS);
        }else{
            timeToStart = now.until(gameStart, ChronoUnit.HOURS);
        }
        System.out.println(timeToStart + " " + timeConsumed);

        Instant ins = Instant.parse("2024-06-25T06:43:30.00z");
        ins.plus(10, ChronoUnit.HOURS);
        System.out.println(ins.plus(-10, ChronoUnit.HOURS));
    }
    // // Given that Daylight Savings Time ends on Nov 1 at 2 AM in US/Eastern time zone, what will the following code print -
    // LocalDateTime ld = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 0);

    // ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern")); // Nov 1 1 AM
    // date = date.plus(Duration.ofDays(1)); // Nov 2 12AM
    // System.out.println(date); 

    // date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    // date = date.plus(Period.ofDays(1)); 
    // System.out.println(date); // Nov 1am
}
