package pl.sda.zajęcia4.funkcje;

import java.util.Scanner;

public class zadanie2 {

    static String odwrocenie_ciagu_znakow(String napis){
        String odwrocenie = "";

        for(int i = 0; i < napis.length(); i++) {
            odwrocenie += napis.charAt(napis.length()-1-i);
        }

        return odwrocenie;
    }

    public static void main(String[] args) {
        /*
        2. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy łańcuch będący odwróceniem
        podanego łańcucha i wyświetla go na ekranie. Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
         */

        Scanner cin = new Scanner(System.in);

        System.out.println("wpisz ciąg znaków");
        String napis = cin.nextLine();

        System.out.println(odwrocenie_ciagu_znakow(napis));


    }
}
