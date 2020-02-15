package pl.sda.webinar;

import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    /*
    6. Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania,
    odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyﬁkować sytuację wprowadzenia
    błędnego symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch do wykonania odpowiedniego
    działania w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
    a) Program wyświetla informację o swoim przeznaczeniu.
    b) Wczytuje pierwszą liczbę.
    c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
    d) Wczytuje drugą liczbę.
    e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
    f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza Enter.
     */

        double a, b, wynik = 0;
        int n = 0;
        char znak;
        System.out.println("-----kalkulator-----");
            System.out.println("podaj a:");
            a = cin.nextDouble();

            System.out.println("podaj znak działania: ");
            znak = cin.next().charAt(0);
            if (znak == '+')
                n = 1;
            else if (znak == '-')
                n = 2;
            else if (znak == '*')
                n = 3;
            else if (znak == '/')
                n = 4;
            else
                System.out.println("podano zły znak!");

            System.out.println(" podaj liczbę: ");
            b = cin.nextDouble();

            switch (n) {
                case 1:
                    wynik = a + b;
                    break;
                case 2:
                    wynik = a - b;
                    break;
                case 3:
                    wynik = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        wynik = a / b;
                    } else
                        System.out.println("nie wolno dzielić przez 0!");
                    break;
            }

            System.out.println("wynik = " + wynik + '\n' + "by zakończyć program wciśnij ENTER");

    }
}
