package pl.sda.zajęcia4;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        /*
        4. Napisać program, który wczytuje od użytkownika liczbę całkowitą, a następnie wyświetla jej
        reprezentację w kodzie binarnym (ZM). Podczas konwersji liczby należy kolejne jej bity zapisywać w
        pomocniczej tablicy liczb całk. o rozmiarze 32. Konwersji należy dokonać korzystając z operacji
        dzielenia całkowitego oraz operacji modulo.
        Przykład:
        Wejście: -75 (liczba podana przez użytkownika)
        Wynik: Liczba -75 binarnie: 1.1001011
         */

        Scanner cin = new Scanner(System.in);
        System.out.println("podaj liczbę:");
        int n = cin.nextInt(), modulo, zapis = 0;
        int[] tab = new int[32];

        if(n < 0){
            zapis = n;
            n *= (-1);
        }

        for (int i = (tab.length-1); i > 0 ; i--) {
            modulo = n % 2;
            n /= 2;
            tab[i] = modulo;
            if(n == 0)
                break;
        }

        if(zapis < 0)
            System.out.print(1 + ".");

        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 1) {
                index = i;
                break;
            }
        }
        for (int i = index; i < tab.length; i++) {
                System.out.print(tab[i]);
        }
    }
}

