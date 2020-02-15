package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        /*
        5. Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie danych kończone jest
        podaniem wartości 0 (nie wliczana do danych). W następnej kolejności program powinien wyświetlić sumę
        największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.

        Przykład: Użytkownik podał ciąg: 1, -4, 2, 17, 0.
        Wynik programu:
        13 // suma min. i maks.
        6.5 // średnia
         */

        Scanner cin = new Scanner(System.in);
        int a = 1, max = 0, min = 0;
        double srednia, suma = 0;

        while (a != 0)
        {
            System.out.println("podaj a:");
            a = cin.nextInt();

            if(a == 0)
                break;

            if(max < a)
                max = a;
            else if(min > a)
                min = a;
        }

        suma = max + min;
        srednia = suma / 2;
        System.out.println("suma: " + suma + " średnia: " + srednia);
    }
}
