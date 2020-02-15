package pl.sda.webinar;

import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        /*
         W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający wyliczenie wysokości
         miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:

        • cena towaru (od 100 zł do 10 tyś. zł),
        • liczba rat (od 6 do 48).

        Kredyt jest oprocentowany w zależności od liczby rat:
            • od 6–12 wynosi 2.5% ,
            • od 13–24 wynosi 5%,
            • od 25–48 wynosi 10%.
        Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien sprawdzać, czy podane dane mieszczą
         się w określonych powyżej zakresach, a w przypadku błędu pytać prosić użytkownika ponownie o podanie danych.
         */

        double cena, raty, wynik, odsetki;

        System.out.println("podaj cenę towaru od 100zł do 10000zł: ");
        cena = cin.nextDouble();

        if(cena >= 100 && cena <= 10000)
        {
            System.out.println("podaj liczbę rat od 6 miesięcy do 48 miesięcy: ");
            raty = cin.nextDouble();
            if(raty >= 6 && raty <= 48)
            {
                if(raty >= 6 && raty < 13) {
                    wynik = cena / raty + (cena / 100) * 2.5;
                    odsetki = (cena / 100) * 2.5;
                    System.out.println("miesięczna rata: " + wynik + " odsetki: " + odsetki);
                }
                else if(raty >= 13 && raty < 25)
                {
                    wynik = cena / raty + (cena / 100) * 5;
                    odsetki = (cena / 100) * 5;
                    System.out.println("miesięczna rata: " + wynik + " odsetki: " + odsetki);
                }
                else {
                    wynik = cena / raty + (cena / 100) * 10;
                    odsetki = (cena / 100) * 10;
                    System.out.println("miesięczna rata: " + wynik + " odsetki: " + odsetki);
                }
            }
            else
                System.out.println("podano złe dane");
        }
        else
            System.out.println("podano złe dane");


    }
}
