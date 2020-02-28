package z_dom_na_7.Firma_new_version;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class Lista_pracownikow {
    ///Pola
    private Pracownik [] lista = new Pracownik[100];
    private int licznik_pracownikow = 0;

    ///konstruktor

    public Lista_pracownikow(){
        Pracownik p = new Pracownik("Krzysztof", "Kozłowski", 'M', 1, 2500, 26, 0, false);
    }

    ////metody
    ///1 - wyświetlanie wszystkich pracowników
    public void print_all(){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] != null)
                lista[i].display_less(i);
        }
    }

    ///2 - dodawanie pracownika
    public void dodaj_pracownika(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Imię: ");
        String imie = cin.nextLine();

        System.out.print("Nazwisko: ");
        String nazwisko = cin.nextLine();

        System.out.print("Płeć: ");
        char plec = cin.nextLine().charAt(0);

        System.out.print("Numer działu: ");
        int numerDzialu = Integer.parseInt(cin.nextLine());

        System.out.print("Płaca: ");
        float placa = Float.parseFloat(cin.nextLine());

        System.out.print("Wiek: ");
        int wiek = Integer.parseInt(cin.nextLine());

        System.out.print("Dzieci: ");
        int dzieci = Integer.parseInt(cin.nextLine());

        System.out.print("Stan cywilny: ");
        boolean aa = Boolean.parseBoolean(cin.nextLine());
        Pracownik nowy_pracownik = new Pracownik(imie, nazwisko, plec, numerDzialu, placa, wiek, dzieci, aa);
        lista[licznik_pracownikow++] = nowy_pracownik;
    }

    ///3 - usuwanie pracownika
    private int ile_mamy_pracownikow(){
        int suma = 0;
        for (int i = 0; i < lista.length; i++){
            if(lista[i] != null)
                suma++;
        }

        return suma;
    }

    public void usun_pracownika(){
        Scanner cin = new Scanner(System.in);
        int suma_pracownikow = ile_mamy_pracownikow(), index = 0;

        if(suma_pracownikow > 0){
            System.out.println("Podaj index pracownika do usunięcia:");
            index = Integer.parseInt(cin.nextLine());
            lista[index] = null;
            System.out.println("Usunięto pracownika.");
        }
        else {
            System.out.println("Lista jest pusta.");
        }
    }

    ///4 - edycja pracownika///////////////DOKONCZYC!!!!!!!
    public void edycja_pracownika(){
        Scanner cin = new Scanner(System.in);
        int suma_pracownikow = ile_mamy_pracownikow(), index = 0;

        if(suma_pracownikow > 0){
            System.out.println("Podaj index pracownika do edycji:");
            index = Integer.parseInt(cin.nextLine());
            lista[index].display_pracownik();

            System.out.println("Z edytownao pracownika.");
        }
        else {
            System.out.println("Lista jest pusta.");
        }
    }

    ///5 - dodatkowe funkcje
    public void dodatkowe_funkcje(){

    }

    ///99 - generator pracownikow

    public void generator_pracownikow(){

    }

    ////settery i gettery


    public Pracownik[] getLista() {
        return lista;
    }

    public void setLista(Pracownik[] lista) {
        this.lista = lista;
    }

    public int getLicznik_pracownikow() {
        return licznik_pracownikow;
    }

    public void setLicznik_pracownikow(int licznik_pracownikow) {
        this.licznik_pracownikow = licznik_pracownikow;
    }
}
