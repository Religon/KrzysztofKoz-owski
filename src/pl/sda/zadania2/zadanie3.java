package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        /*
        3. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie wyświetla na ekranie
        wszystkie potęgi liczby 2 nie większe, niż podana liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
        1 2 4 8 16 32 64
         */

        Scanner cin = new Scanner(System.in);

        int n, wynik = 1;

        System.out.println("podaj liczbę całkowitą dodatnią:");
        n = cin.nextInt();

        if(n > 0){
            while (wynik < n){
                System.out.print(wynik + ", ");
                wynik = wynik * 2;
            }

            /*
            lub
            for(int i = 1; i < n; i = i *2){
                System.out.print(i + ", ");

             */

        }
        else
            System.out.println("n musi być dodatnie!!!");
    }
}
