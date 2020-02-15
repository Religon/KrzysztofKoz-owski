package pl.sda.zajęcia5.prostokąt;

import java.util.Scanner;

public class ProstokatProgram {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int a, b;

        System.out.println("prostokąt A:");
        System.out.println("podaj a ");
        a = cin.nextInt();
        System.out.println("podaj b");
        b = cin.nextInt();
        prostokąt A = new prostokąt(a, b);
        System.out.println("pole = " + A.obliczPole());
        System.out.print("obwód = " + A.obliczObwod() + "\n\n");

        System.out.println("prostokąt B");
        System.out.println("podaj a ");
        a = cin.nextInt();
        System.out.println("podaj b");
        b = cin.nextInt();
        prostokąt B = new prostokąt(a, b);
        System.out.println("pole = " + B.obliczPole());
        System.out.println("obwód = " + B.obliczObwod());

        System.out.println("prostokąt C");
        System.out.println("podaj a ");
        a = cin.nextInt();
        System.out.println("podaj b");
        b = cin.nextInt();
        prostokąt C = new prostokąt(a, b);
        System.out.println("pole = " + C.obliczPole());
        System.out.println("obwód = " + C.obliczObwod());

    }
}
