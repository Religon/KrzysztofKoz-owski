package pl.sda.zajęcia7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class zadanie5_6 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2018, 6,22);
        System.out.println(data);
        System.out.println(data.getDayOfMonth() + "." + data.getMonthValue() + "." + data.getYear());

        Duration duration = Duration.between(data, LocalDate.now());
        Period period = Period.between(data, LocalDate.now());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
