package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
       /*
    4. Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki nie podana zostanie liczba 0.
     Następnie wyświetlić sumę wszystkich podanych liczb.
     */

        Scanner cin = new Scanner(System.in);

        int a = 1, suma = 0;

        while(a != 0)
        {
            System.out.println("podaj liczbę: ");
            a = cin.nextInt();
            suma = suma + a;
        }
        System.out.println("suma: " + suma);
    }

}
