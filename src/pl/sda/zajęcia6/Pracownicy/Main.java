package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Lista_pracownikow());
        Scanner cin = new Scanner(System.in);
        String linia = "";



        while(!linia.equals("e")){
            menu.printmenu();
            System.out.println("by zakończyć wciśnij e");
            linia = cin.nextLine();

            System.out.println(linia);

        }


        //ListaPracownikow listaPracownikow = new ListaPracownikow();
        //listaPracownikow.addNewPracownik();
    }
}
