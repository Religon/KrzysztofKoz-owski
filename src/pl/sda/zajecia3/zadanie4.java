package pl.sda.zajecia3;

import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        /*
        Zadanie 4 Napisać program zliczający długość łańcucha znakowego.
         ● Z białymi znakami
         ● Bez białych znaków
         */

        //"ala ma kota", "piortr", "zadanie4"

        // policz liczbę znaków ze spacją i bez
        //wyświetl na końcu wynik
        //np. "długość napisów ... ze spacjami wynosi: wynik
        //"bez spacji ... "

        Scanner cin = new Scanner(System.in);
        System.out.println("podaj dowlony napis:");

        String text;

        text = cin.nextLine();

        int dlugosc = text.length();
        System.out.println("dlugość:" + dlugosc);
        /*
        String bezspacji = imie.replaceAll(" ", "");
        dlugosc = bezspacji.length();
        System.out.println("bez spacji: " + dlugosc);
        */
        int licznik = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' ')
                licznik++;
        }
        System.out.println("bez spacji: " + licznik);

        //wyswietlić napis małymi i dużymi literami

        System.out.println("tekst małymi literami to: " + text.toLowerCase());
        System.out.println("tekst małymi literami to: " + text.toUpperCase());
    }
}
