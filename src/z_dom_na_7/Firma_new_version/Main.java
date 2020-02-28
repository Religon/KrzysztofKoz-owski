package z_dom_na_7.Firma_new_version;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Lista_pracownikow());
        Scanner cin = new Scanner(System.in);
        String linia = "";

        while(!linia.equals("e")){
            menu.printMenu();
            System.out.println("by zakończyć wciśnij e, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);
        }
    }
}
