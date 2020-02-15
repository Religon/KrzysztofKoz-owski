package pl.sda.zajecia3.arrays;

import java.util.Random;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        /*
        3. Napisz program, który:
        • stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
        • wypełnij ją losowymi wartościami z zakresu {−5,−4,...,5},
        • dla każdej kolumny wyznacz minimum,
        • dla każdej kolumny wyznaczy maksimum.
        Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz maksymami.
         */

        Scanner cin = new Scanner(System.in);
        System.out.println("podaj rozmiar maciezy r x r:");
        int r = cin.nextInt();
        int[][] maciez = new  int[r][r];

        System.out.print("rozmiary macieży:" + maciez.length + ", "); // zwraca liczbę wierszy
        System.out.print(maciez[0].length + "\n"); // zwraca liczbę kolumn

        Random rand = new Random();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < r; j++){
                maciez[i][j] = rand.nextInt(11) - 5;
                System.out.print(maciez[i][j] + "\t");
            }
            System.out.println();
        }

        int max , min;
        int[][] max_min = new int[r][2];

        for(int i = 0; i < r; i++){
            max = maciez[i][r-1];
            min = maciez[i][0];
            for(int j = 0; j < r; j++){
                if(min > maciez[i][j]) {
                    min = maciez[i][j];
                }
                else if(max < maciez[i][j]) {
                    max = maciez[i][j];
                }
            }
            max_min[i][0] = min;
            max_min[i][1] = max;
        }

        System.out.println();
        System.out.println("max i min dla każdego wiersza:");
        System.out.println();
        System.out.println("min\tmax");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < 2; j++)
                System.out.print(max_min[i][j] + "\t");
            System.out.println();
        }
    }

}
