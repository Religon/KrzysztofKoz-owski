package pl.sda.z_dom_na_7.zadanie6;

import java.util.Random;
import java.util.Scanner;
/*
Szyfrołamacz – użytkownik musi odgadnąć 4 cyfrowe hasło, ma 5 żyć, po podaniu hasła program informuje go czy podany kod
był większy lub mniejszy od hasła. Po utracie wszystkich żyć program kończy działanie
a. Po utracie wszystkich żyć program pyta użytkownika czy chce spróbować ponownie
b. Użytkownik może raz w ciągu gry poprosić o podpowiedź która odsłoni jedno z 4 cyfr tajnego hasła
 */

public class Szyfr {
    public static void podpowiedz(int haslo){
        Random losowanie = new Random();
        int l = losowanie.nextInt(4);
        int []zamiana = new int [4];

        for(int i = (zamiana.length-1); i > 0; i--){
            zamiana[i] = haslo % 10;
            haslo = haslo / 10;
        }

        if(l == 1)
            System.out.println(zamiana[l-1] + " _ _ _");
        else if(l == 2)
            System.out.println("_ " + zamiana[l-1] + " _ _");
        else if(l == 3)
            System.out.println("_ _ " + zamiana[l-1] + " _");
        else if(l == 4)
            System.out.println("_ _ _" + zamiana[l-1]);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int [] hasla = {4561, 2136, 7894, 1234, 4321, 9876};
        Random losowanie = new Random();
        int haslo, nr_losowania, liczba_zyc = 5, liczba_wskazowek = 1;
        String koniec = "";

        while (!koniec.equals("t")) {
            nr_losowania = losowanie.nextInt(6);
            System.out.println(hasla[nr_losowania]);

            while(liczba_zyc > 0) {
                System.out.println("Podaj hasło:");
                haslo = cin.nextInt();

                if (haslo == hasla[nr_losowania]) {
                    System.out.println("Zgadłeś hasło!");
                    break;
                }
                else if (haslo > hasla[nr_losowania]) {
                    liczba_zyc--;
                    System.out.println("Żle!\nPodane hasło jest mniejsze od zgadywanego hasła.\n Zostało ci " + liczba_zyc);

                    if(liczba_wskazowek == 1) {
                        System.out.println("Czy chcesz podpowiedź?(t)Możesz jej uzyć tylko raz!");
                        cin.nextLine();
                        koniec = cin.nextLine();
                        System.out.println(koniec);
                        if (koniec.equals("t"))
                            podpowiedz(hasla[nr_losowania]);
                        liczba_wskazowek--;
                    }
                } else if (haslo < hasla[nr_losowania]) {
                    liczba_zyc--;
                    System.out.println("Żle!\nPodane hasło jest większe od zgadywanego hasła.\n Zostało ci " + liczba_zyc);

                    if(liczba_wskazowek == 1) {
                        System.out.println("Czy chcesz podpowiedź?(t)Możesz jej uzyć tylko raz!");
                        cin.nextLine();
                        koniec = cin.nextLine();
                        System.out.println(koniec);
                        if (koniec.equals("t"))
                            podpowiedz(hasla[nr_losowania]);
                        liczba_wskazowek--;
                    }
                }
            }


            liczba_zyc = 5;
            System.out.println("Czy chcesz spróbować ponownie?(t)");
            cin.nextLine();
            koniec = cin.nextLine();
            System.out.println(koniec);
        }
    }
}
