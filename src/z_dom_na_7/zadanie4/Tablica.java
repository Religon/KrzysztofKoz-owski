package z_dom_na_7.zadanie4;

import java.util.Scanner;

public class Tablica {

    public Tablica() {
    }

    ///////a
    public int[] Psvm(){
        return this.tworzenie_tablicy();
    }


    public void drukujOpisTablicy(){
        double srednia = 0;
        Scanner cin = new Scanner(System.in);
        int [] tab = this.Psvm();
        int min = tab[0], max = tab[0];
        String koniec = null;

        while (koniec != "t" || koniec != "T"){
            ///minimalna wartość

            for (int j = 1; j < tab.length; j++) {
                if (min > tab[j])
                    min = tab[j];
                else if (max < tab[j])
                    max = tab[j];
            }

            System.out.println("wartość minimalna: " + min + "\nwartość maxymalna: " + max);

            ///średnia

            for (int i = 0; i < tab.length; i++) {
                srednia += tab[i];
            }
            srednia = srednia / tab.length;
            System.out.println("średnia wartość: " + srednia + "\nIlość elementów: " + tab.length);

            System.out.println("By kontynuować wciśnij T, by zakończyć N");
            koniec = cin.nextLine();
            System.out.println(koniec);
            
            if(koniec != "n" || koniec != "N")
                break;
        }
    }

    ////b
    public int[] tworzenie_tablicy(){
        int rozmiar;
        Scanner cin = new Scanner(System.in);
        System.out.println("ilu elementową tablicę chcesz zrobić:");
        rozmiar = cin.nextInt();
        int [] tablica = new int[rozmiar];

        for(int i = 0; i < rozmiar; i++) {
            System.out.print(i + " - ");
            tablica[i] = cin.nextInt();
        }

        return tablica;
    }




}
