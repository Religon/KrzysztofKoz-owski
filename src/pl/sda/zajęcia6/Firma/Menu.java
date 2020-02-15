package pl.sda.zajęcia6.Firma;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Firma f = new Firma("Krzysztof", "Kozłowski", 'M', 100, 2500, 26,0, false);
        Scanner cin = new Scanner(System.in);

        f.display_employe();
        f.display_less();
        f.display_special();
    }
}
