package pl.sda.webinar;

import java.util.Scanner;

public class zadania1 {
    public static void main(String[] args) {
        /*
        1. Napisać program służący do konwersji wartości temperatury
         podanej w stopniach Celsjusza na stopnie w skali Fahrenheita
         (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
         */

        double stopnieF, stopnieC;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("podaj stopnie celcjusza: ");
        stopnieC = odczyt.nextDouble();
        stopnieF = 1.8 * stopnieC + 32;
        System.out.println("stopnie Fahrenheita = " + stopnieF);
    }
}
