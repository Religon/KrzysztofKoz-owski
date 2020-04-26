package pl.sda.zajęcia12.zad1;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("pierwszy", "drugi", "trzeci", "czwarty", "piaty");
        //Set<String> unique = new LinkedHashSet(strings); ///sortowanie po kolejności
        Set<String> unique = new TreeSet<>(strings); // sortowanie alfabetyczne

        System.out.println(strings);
        System.out.println(unique);
    }
}
