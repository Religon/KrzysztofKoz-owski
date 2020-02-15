package pl.sda.webinar;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        /*
        Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz najmniejszą z nich.
         */
        Scanner odczyt = new Scanner(System.in);

        int a, b, c;
        System.out.println("podaj a:");
        a = odczyt.nextInt();
        System.out.println("podaj b:");
        b = odczyt.nextInt();
        System.out.println("podaj c:");
        c = odczyt.nextInt();

        if(a >= b && a >= c)
            System.out.println("max: " + a);
        else if(b >= a && b >= c)
            System.out.println("max: " + b);
        else
            System.out.println("max: " + c);

        if(a <= b && a <= c)
            System.out.println("min: " + a);
        else if(b <= a && b <=c)
            System.out.println("min: " + b);
        else
            System.out.println("min: " + c);
    }
}
