package pl.sda.zajecia3.arrays;

public class zadanie1 {
    public static void main(String[] args) {
        /*
        1. Napisać program, który:
        • utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z przedziału [−10,...,10],
        • wypisze na ekranie zawartość tablicy,
        • wyznaczy najmniejszy oraz najwięszy element w tablicy,
        • wyznaczy średnią arytmetyczną elementów tablicy,
        • wyznaczy ile elementów jest mniejszych, ile większych od średniej.
        • wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
         */

        int wiek = 10;
        String imie = "Piotr";

        // tworzenie tablicy 10-elemntowej
        int[] liczby = new int[10];

        //wpisywanie wrtości do tablicy
        liczby[0] = 25;
        liczby[4] = 100;

        //wpisywanie wartości z tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);
        System.out.println(liczby[0]);

        int rozmiar = liczby.length;

        //dynamiczne tworzenie tablicy
        int[] dynamicznaTablica = new int[rozmiar];

        for(int i = 0; i < rozmiar; i++){
            liczby[i] = (int)(Math.random()*21) - 10; // zakres losowania od [-10, 10]. 21 bo rozmiar tego 20 i jeszcze 0
            System.out.print(liczby[i] + " ");
        }

        int max = liczby[rozmiar-1], min = liczby[0], suma = 0;

        for(int i = 0; i < rozmiar; i++){
            if(max < liczby[i])
                max = liczby[i];
            else if(min > liczby[i])
                min = liczby[i];
            suma += liczby[i];
        }
        int srednia = suma / rozmiar;
        System.out.println("\nmax = " + max + " min = " + min + " średnia = " + srednia);

        int mniejsze = 0, wieksze = 0;
        for(int i = 0; i < rozmiar; i++){
            if(srednia > liczby[i])
                mniejsze++;
            else if(srednia < liczby[i])
                wieksze++;
        }
        System.out.println("liczba elementów mniejszych: " + mniejsze + "\nliczba elementów większych: " + wieksze);

        for(int i = 0; i < rozmiar; i++){
            dynamicznaTablica[(rozmiar - i - 1)] = liczby[i];
        }

        System.out.println("odwrotna kolejność:");
        for(int i = 0; i < rozmiar; i++)
            System.out.print(dynamicznaTablica[i] + " ");

    }
}
