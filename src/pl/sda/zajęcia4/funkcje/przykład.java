package pl.sda.zajęcia4.funkcje;

public class przykład {

    //prosta funkcja pobierająca 2 argumenty i zwracająca ich sumę
    // funkcje i metody definiujemy w ciele KLASY, a więc nie w MAIN

    static int dodaj(int a, int b){
        return a + b;
    }

    // funkcja, która nic nie zwraca, ale wypisuje zawartość tablicy

    static void displayTab(String[] tab){
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.print("\b\b]");//kasujem ostatni przecinek
    }

    // funkcja do opisania n-tego elementu ciągu fibonaciego

    static int fibonacci(int n){
        int fa = 1;
        int fb = 1, F = 0;
        if(n == 0)
            F = 0;
        else if(n == 1)
            F = 1;
        else if(n > 1) {
            for (int i = 3; i <= n; i++) {
                F = fa + fb; // pierwszy obieg to F3
                fa = fb;
                fb = F;
            }
        }
        return F;
    }


    public static void main(String[] args) {
        int pierwsza_liczba  = 10;
        int druga_liczba = 20;
        int wynik = dodaj(pierwsza_liczba, druga_liczba);
        System.out.println("wynik dodawania to: " + wynik + "\n");

        String[] imiona = {"Jan", "Ala", "Piotr"};
        displayTab(imiona);
        System.out.print("\n\nFibonacci rzędu:");

        int n = 5;
        System.out.println(n + " to " + fibonacci(n));
    }
}
