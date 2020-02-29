package pl.sda.z_dom_na_7.Firma_new_version;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu(new Lista_pracownikow());
        Scanner cin = new Scanner(System.in);
        String linia = "", listaP = "";

        while(!linia.equals("e")){
            listaP += menu.printMenu();
            PrintWriter tekstowy = new PrintWriter("plik.txt");
            tekstowy.println(listaP);
            tekstowy.close();
            System.out.println("by zakończyć wciśnij e, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);
        }

        File plik = new File("D:/KrzysztofKoz-owski/plik.txt");
        Scanner wejscie = new Scanner(plik);

        String l = wejscie.nextLine();
        System.out.println(l);

    }
}
