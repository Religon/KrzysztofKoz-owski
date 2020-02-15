package pl.sda.zadania2;

import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        /*
        6. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1...100, a gracz (użytkownik) ma za zadanie
        odgadnąć, co to za liczba poprzez podawanie kolejnych wartości. Jeżeli podana wartość jest:
        • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
        • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
        • identyczna z wylosowaną – wyświetlany jest
        komunikat „Gratulacje” i gra się kończy.
         */

        Scanner cin = new Scanner(System.in);

        int a = 0, max = 100, min = 1, range = max + min + 1, rand = 0, x = 0;

        while(x != 1){
            System.out.println("podaj liczbę do porównania:");
            a = cin.nextInt();
            rand = (int)(Math.random() * range) + min;
            System.out.println("rand = " + rand);
            if(a > rand)
                System.out.println("podałeś za dużą wartość");
            else if(a < rand)
                System.out.println("podałeś za małą wartość");
            else if(a == rand)
                x = 1;
        }
        System.out.println("gratulacje!");
    }
}
