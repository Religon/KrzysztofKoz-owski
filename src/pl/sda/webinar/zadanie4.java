package pl.sda.webinar;

import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        /*
        4. Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych. Program ma pobierać od
         użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg.
         następujących reguł:
        • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
        • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
         */

        double dochod, podatek;
        Scanner cin = new Scanner(System.in);

        System.out.println("podaj dochód: ");
        dochod = cin.nextDouble();

        if(dochod < 85528) {
            podatek = (dochod / 100)*18 - 556.02;
            System.out.println("podatek = " + podatek);
        }
        else{
            podatek = 14839.02 + ((dochod - 85528.00) / 100 * 32);
            System.out.println("podatek = " + podatek);
        }

    }
}
