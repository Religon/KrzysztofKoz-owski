package pl.sda.zajęcia4.funkcje;

import java.util.Scanner;

public class zadanie3 {

    static boolean palindron(String napis){
        for(int i = 0; i < napis.length(); i++){
            if(napis.charAt(i) == napis.charAt(napis.length()-1-i)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
        3. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie
        sprawdza, czy podany ciąg jest palindromem.
         */

        Scanner cin = new Scanner(System.in);
        System.out.println("podaj napis:");
        String napis = cin.nextLine();
        napis.replaceAll(" ", "");
        System.out.println(palindron(napis));
    }
}
