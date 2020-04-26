package pl.sda.zajęcia12.speedway;

import java.util.ArrayList;
import java.util.List;

public class Track {/*
    Zasymuluj zachowanie wyścigu żużlowego. W wyścigu bierze udział 4 zawodników (klasa Rider). Jeżdża po torze
    (klasa Stadium/Track) o znanej długości (np tor na Golęcinie ma 370m). Każdy z żużlistów ma stałą, różną między sobą
     prędkość (sprawdźcie rzeczywiste wartości). Wyścig kończy się po przejechaniu 4 okrążeń.
    Wyświetl komunikat na ekranie w następujących sytuacjach

    -Każdy żużlista po przejechaniu okrążenia daje informację o tym + czas przejazdu kółka
    -Pierwszy żużlista po 4 okrążeniach (zwycięzca) + sumaryczny czas wszystkich okrążeń
    -W momencie dublowania innego żużlisty + informacja kogo minąłem

    Pierwsze 2 komunikaty macie dobre wskazówki w innych aplikacjach. Żeby okodzić trzecie wymaganie, można np każdemu
    żużliście podać informację (referencje) do przeciwników. Nie martwcie się tym, ze krzykniecie "zdublowałem!" trochę
    później niż sama sytuacja ma miejsce - żużlista podnosi :middle_finger: tak, żeby jego przeciwnik to widział przed
    sobą :slightly_smiling_face:. Do zdublowania nie używajcie metod matematycznych - wiadomo, że da się wyliczyć w
    której sekundzie kto kogo zdubluje, ale chodzi o zasymulowanie tego.

    Rozszerzenia do zadania:
    -Żużliści zaczynają z 0 km/h i przyspieszają do swojej maksymalnej prędkości motocykla
    -Co jakiś czas rzucamy kostką i decydujemy czy żużlista przyspiesza czy spowalnia o mały ułamem (parę km/h), ale
    nigdy powyżej Vmax motocykla albo poniżej jakiegoś progu (np 10km/h)
*/

    public static void main(String[] args) {

        List<Rider> riders = new ArrayList<>();
        riders.add(new Rider("zawodnik1"));
        riders.add(new Rider("zawodnik2"));
        riders.add(new Rider("zawodnik3"));
        riders.add(new Rider("zawodnik4"));

    }


}
