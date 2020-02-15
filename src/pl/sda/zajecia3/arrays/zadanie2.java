package pl.sda.zajecia3.arrays;


import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        /*
        2. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1...10, a następnie wypisze na
        ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
        Przykład:
        Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
        Wystąpienia:
        1 - 1
        2 - 1
        3 - 3
        4 - 3
        5 - 3
        6 - 4
        7 - 1
        8 - 2
        9 - 0
        10 - 2
         */
        System.out.println("podaj rozmiar: ");
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();
        int[] tab = new int[r];
        int licznik = 0;

        for(int i = 0; i < r; i++){
            tab[i] = (int)(Math.random()*r + 1);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for(int i = 1; i <= r; i++){
            for(int j = 0; j < r; j++){
                if(i == tab[j])
                    licznik++;
            }
            System.out.println(i + " - " + licznik);
            licznik = 0;
        }


        // drugi sposób
        Random rand = new Random();
        rand.nextInt(10); // bound - zakres : 10 - [0,9]

        //pętla for each
        System.out.println();
        for(int liczba : tab){
            System.out.print(liczba + ", ");
        }
    }
}
