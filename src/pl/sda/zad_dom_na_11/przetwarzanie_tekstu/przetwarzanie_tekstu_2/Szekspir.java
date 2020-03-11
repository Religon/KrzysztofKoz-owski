package pl.sda.zad_dom_na_11.przetwarzanie_tekstu.przetwarzanie_tekstu_2;

import java.io.*;
import java.util.Objects;

public class Szekspir {
    public static void main(String[] args) throws IOException {
        /*
        Zsumuj wszystkie liczebniki słowne z dzieła Szekspira.
         */

        String [] numeral = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int[] number = new int[19];
        for(int i = 0; i < numeral.length; i++){
            number[i] = i + 1;
        }
        String searched = "";
        int count = 0;
        try (FileReader inputStream = new FileReader("t8.shakespeare.txt")) {
            int c;
            char a;

            while ((c = inputStream.read()) != -1) {
                if (c != 32 && c != 44 && c != 46 && c != 58 && c != 63) {
                    searched += (char) c;
                } else {
                    for (int i = 0, numeralLength = numeral.length; i < numeralLength; i++) {
                        String s = numeral[i];
                        if (Objects.equals(s, searched)) {
                            count += number[i];
                        }
                    }
                    searched = "";
                }
            }
            System.out.println("liczba liczebników: " + count);
        }
    }
}
