package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Lista_pracownikow());
        Scanner cin = new Scanner(System.in);
        String linia = "";
        int nr = 1;

        while(!linia.equals("e")){
            menu.printmenu(nr);
            System.out.println("by zakończyć wciśnij e, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);

        }

    }
}
