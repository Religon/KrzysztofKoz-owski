package z_dom_na_7.zadanie4;

import java.util.Scanner;

public class Menu {
    //Pola
    private Kalkulator k;

    //konstruktor

    public Menu(Kalkulator k) {
        this.k = k;
    }

    ///Metody
    public void menu(){
        String koniec = "";
        Scanner cin = new Scanner(System.in);
        char znak;
        double a, b, wynik = 0;
        System.out.println("KALKULATOR\n");

        a = cin.nextDouble();
        while(!koniec.equals("e")){
            System.out.println("podaj znak działania:");
            System.out.println("+ dodawanie\n- odejmowanie\n* mnożenie\n/ dzielenie\n% modulo");
            znak = cin.next().charAt(0);
            System.out.println("podaj drugą liczbę:");
            switch (znak){
                case '+':
                    b  = cin.nextDouble();
                    wynik = k.dodawanie(a, b);
                    System.out.println(a + " + " + b + " = " + wynik);
                    break;
                case '-':
                    b  = cin.nextDouble();
                    wynik = k.odejmowanie(a, b);
                    System.out.println(a + " - " + b + " = " + wynik);
                    break;
                case '*':
                    b  = cin.nextDouble();
                    wynik = k.mnozenie(a, b);
                    System.out.println(a + " * " + b + " = " + wynik);
                    break;
                case '/':
                    b  = cin.nextDouble();
                    wynik = k.dzielenie(a, b);
                    System.out.println(a + " / " + b + " = " + wynik);
                    break;
                case '%':
                    b  = cin.nextDouble();
                    wynik = k.modulo(a, b);
                    System.out.println(a + " % " + b + " = " + wynik);
                    break;
                default:
                    break;
            }

            a = 0;
            a = wynik;
            cin.nextLine();
            System.out.println("\nBy zakończyć wciśnij 'e', by kontynować wcisnij cokolwiek innego.");
            koniec = cin.nextLine();
            System.out.println(koniec);
        }
    }

    ///settery i gettery

    public Kalkulator getK() {
        return k;
    }

    public void setK(Kalkulator k) {
        this.k = k;
    }
}
