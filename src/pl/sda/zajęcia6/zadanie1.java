package pl.sda.zajęcia6;

import java.util.Scanner;
import java.util.Random;

public class zadanie1 {
    public static void main(String[] args) {
        /*
        1. Napisz program symulujący grę w Lotto:
        a. Użytkownik typuje 6 cyfr
        b. Program losuje 6 cyfr z liczb od 1 do 49
        c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
        d. Program wypisuje na ekranie wylosowane cyfry
        e. Program wyświetla wynik użytkownika w poniższej formie:
        i. Trafiono n z 6 cyfr
        f. *Upewnij się że użytkownik podaje 6 różnych liczb
        g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
        h. ! Skorzystaj z klasy java.util.Random
         */
        Scanner cin = new Scanner(System.in);

        int rozmiar = 6;
        int[] tab = new int [rozmiar];
        int[] tab2 = new int [rozmiar];

        Random rand = new Random();

        System.out.println("wprowadź liczby do losowania:");
        for(int i = 0; i < rozmiar; i++){
            tab[i] = cin.nextInt();
            if(tab[i] < 50 & tab[i] > 0)
                System.out.println("OK");
            else{
                System.out.println("liczby z zakresu 1-49!");
                break;
            }
            tab2[i] = rand.nextInt(50) + 1;
        }

        for(int i = 0; i < rozmiar; i++) {
            System.out.println(i + ". " + tab[i] + "\t" + tab2[i]);
        }

        int n = 0;

        for(int i = 0; i < rozmiar; i++){
            for(int j = 0; j < rozmiar; j++){
                if(tab[i] == tab2[j])
                    n++;
            }
        }

        System.out.println("trafiono " + n + " z 6 liczb");
    }
}
