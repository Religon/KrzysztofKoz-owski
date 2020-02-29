package pl.sda.z_dom_na_7.zadanie5;

import java.util.Random;
import java.util.Scanner;

public class wisielec {
    /*
    5. Napisz program ‘wisielec’ – użytkownik ma 5 żyć, użytkownik może podać jedynie 1 literę – gdy poda więcej
    przegrywa grę. Jeśli poda literę spoza hasła, traci jedno życie, gdy zostanie bez żyć <0 przegrywa grę.
    a. Użytkownik sam wpisuje hasło dla przeciwnika
    b. * Hasło jest losowane z słownika czyli tablicy haseł
    c. ** Po zakończeniu gry – zapytanie do użytkownika czy chce kontynuować dalej grę (t/n)
     */

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String [] slowa = {"klucz"};//, "jajko", "nożyczki", "stół", "krzesło", "myszka", "laptop", "kanapa", "winda", "komórka"};
        Random losowanie = new Random();
        String haslo = null, koniec = "";
        char litera;
        int licznik = 0, a, liczba_zyc;
        char [] haslo2;

        while (!koniec.equals("t") && !koniec.equals("T")) {
            a = losowanie.nextInt(1);
            haslo = slowa[a];
            haslo2 = haslo.toCharArray();
            liczba_zyc = haslo2.length;
            System.out.println("Hasło ma " + haslo2.length + " liter.");

            while(liczba_zyc != 0){
                System.out.println("podaj literę:");
                litera = cin.nextLine().charAt(0);
                for(int i = 0; i < haslo2.length; i++){
                    if(litera == haslo2[i]) {
                        licznik++;
                    }
                }

                if(licznik == 0){
                    liczba_zyc--;
                    System.out.println("litera się nie zgadza!");
                }

                if(licznik > 0)
                    System.out.println("OK " + licznik + "/" + haslo2.length);

                if(licznik == haslo2.length) {
                    System.out.println("Hasło się zgadza!");
                    break;
                }

                if(liczba_zyc == 0){
                    System.out.println("Zużyłeś wszystkie życia!!");
                }
                else
                    System.out.println("Zostało ci " + liczba_zyc + " żyć");
            }

            licznik = 0;
            System.out.println("By kontynuowć wciśnij t lub T.");
            koniec = cin.nextLine();
            System.out.println(koniec);
        }
    }







}
