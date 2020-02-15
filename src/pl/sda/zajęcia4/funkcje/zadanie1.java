package pl.sda.zajęcia4.funkcje;

import java.util.Scanner;

public class zadanie1 {

    static int licznikOstatniejLitery(String napis){
        int r = napis.length(), licznik = 0;
        char ostatnia  = napis.charAt(r-1);

        for(int i = 0; i < r; i++){
            if(napis.charAt(i) == ostatnia)
                licznik++;
        }

        return licznik;
    }

    public static void main(String[] args) {
        /*
        1. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla informację o tym ile razy
        w tym ciągu powtarza się jego ostatni znak.

        Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ ostatnim znakiem jest literka „a”,
        która występuje w podanym ciągu łącznie 4 razy.
         */

        System.out.println("podaj dowolny napis, a ja policzę ilość wystąpień ostatniej litery");
        Scanner cin = new Scanner(System.in);
        String napis = cin.nextLine();
        System.out.println(licznikOstatniejLitery(napis));
    }
}
