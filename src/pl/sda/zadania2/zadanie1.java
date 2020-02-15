package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        /*
        1. Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na
        ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby. Przykład, dla 15 program
        powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
         */
        Scanner cin = new Scanner(System.in);
        int a;

        System.out.println("podaj liczbę całkowitą dodatnią: ");
        a = cin.nextInt();

        if(a > 0)
        {
            for(int i = 1; i <= a; i++)
            {
                if(i%2 != 0)
                    System.out.println(i + " ");
            }
        }
        else
            System.out.println("podano liczbę ujemną!");
    }
}
