package pl.sda.zajęcia5;

public class Osoba {  //Ciało klasy
    //Pola w klasie
    public String imie;
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    /*
    Konstruktor jest funkcją
    1)nazywa się tak samo jak klasa.
    2)nie piszemy/ nie ma typu zwracanego, nawet void.
     */

    // jesli nie ma zadnego konstruktora to pusty konstruktor jest generowany automatycznie
    // jesli zdefiniujemy JAWNIE konstruktor parametrowy, to ten konstruktor juz nie jest generowany automacztycznie
    // jesli potrzebujemy domyślnego konstruktora to musimy go zdefiniować JAWNIE
    // jesli usuniemy ten konstruktor to będziemy musieli zawsze tworzyc obiekty osoba
    // za pomocą konstruktora 3 arugmentowego
    //konstruktor bezparametrowy
    public Osoba(){
        System.out.println("asdasd");
    }

    //przeciążenie konstruktora
    //jawny konstruktor
    public Osoba(String imie, String nazwisko, int w){
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = w; // Bo w polu konstruktora jest w(fiolet jest kolorem parametru), this jest nie potrzebne
    }

    public String przedstaw_sie(){
        return "na imię mam "  + this.imie + " " + this.nazwisko + " i mam lat " + this.wiek;
    }

}
