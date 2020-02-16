package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner cin = new Scanner(System.in);
        String linia = "";

        while(!linia.equals("e")){
            //menu.printmenu();
            linia = cin.nextLine();
            System.out.println(linia);
        }

        //Firma pracownik = new Firma();
        //pracownik.addNewPracownik();
    }
}
