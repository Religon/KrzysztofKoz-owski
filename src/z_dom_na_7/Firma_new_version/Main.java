package z_dom_na_7.Firma_new_version;

import pl.sda.zajęcia6.Pracownicy.Lista_pracownikow;
import pl.sda.zajęcia6.Pracownicy.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pl.sda.zajęcia6.Pracownicy.Menu menu = new Menu(new Lista_pracownikow());
        Scanner cin = new Scanner(System.in);
        String linia = "";

        while(!linia.equals("e")){
            menu.printmenu();
            System.out.println("by zakończyć wciśnij e, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);
        }
    }
}
