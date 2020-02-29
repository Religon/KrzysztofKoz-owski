package pl.sda.zajęcia7;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.Timer;

public class Zegar_java {
    public static void main(String[] args) {
        Instant instant  = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.parse("2020-02-29T08:36:46.155Z");
        instant1 = instant1.minus(Duration.ofDays(05));
        System.out.println(instant1);

        Instant instant2 = instant1.plus(Duration.ofHours(8));
        System.out.println(instant2);

        boolean check = instant1.isBefore(instant2);
        System.out.println(check);

        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specialDay = LocalDate.of(2022, 3, 11);
        LocalDate specialDay2 = LocalDate.of(2022, Month.FEBRUARY, 15);

        String myBirthday = "1993-08-04";
        LocalDate myBirthdayLocalDate = LocalDate.parse(myBirthday);
        LocalDate tommorow = LocalDate.now().plusDays(1);

        System.out.println();

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime meeting  = LocalTime.of(11, 30, 0);

        LocalTime meetingFinish = meeting.plusHours(3);
        System.out.println(meetingFinish.isAfter(meeting));

        System.out.println();

        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));

        ZoneId New_York = ZoneId.of("America/New_York");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(New_York));

        System.out.println();

        LocalDateTime myFatherBitrhday = LocalDateTime.of(1954, Month.MARCH, 5, 7, 55);
        LocalDateTime myBirthday2 = LocalDateTime.of(1993, Month.APRIL, 8, 8,2);

        Duration duration = Duration.between(myFatherBitrhday, myBirthday2);
        System.out.println(duration.getSeconds());

        Period period = Period.between(myFatherBitrhday.toLocalDate(), myBirthday2.toLocalDate());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long years  = ChronoUnit.YEARS.between(myFatherBitrhday, myBirthday2);
        System.out.println(years);

    }
}
