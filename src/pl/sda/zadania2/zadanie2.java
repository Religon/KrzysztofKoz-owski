package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        /*
        2. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B, a następnie wyznaczający
        sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B). Obliczenia należy wykonać trzykrotnie stosując
        kolejno pętle: while, do-while, for.
        Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60 60
         */

        Scanner cin = new Scanner(System.in);
        int A, B, wynik = 0;
        System.out.println("A < B");
        System.out.println("Podaj A:");
        A = cin.nextInt();
        System.out.println("podaj B:");
        B = cin.nextInt();

        if(A < B)
        {
            for(int i = 0; i <= B; i++)
            {
                wynik = wynik + A + 1;
            }
            System.out.println("wynik dla for: " + wynik);

            int i = 0;
            wynik = 0;

            while(i <= B)
            {
                wynik = wynik + A + 1;
                i++;
            }
            System.out.println("wynik dla while: " + wynik);

            i = 0;
            wynik = 0;

            do{
                wynik = wynik + A + 1;
                i++;
            }while(i <= B);
            System.out.println("wynik dla do while: " + wynik);
        }
        else
            System.out.println("A < B!!!");
    }
}
