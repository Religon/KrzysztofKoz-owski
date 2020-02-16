package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Lista_pracownikow {
    private final static int domyślny_rozmiar_listy = 100;
    private Firma[] lista;
    private int rozmiar;
    private int licznik;

    ///////////
    ////metody
    ///////////

    public void printlista(){
        //System.out.println(this.licznik);

        for(int i = 0; i < licznik; i++){
            if(lista[i] != null)
                lista[i].display_employe();
        }
    }

    public void add_employe(int nr){
        Scanner cin = new Scanner(System.in);
        String imie, nazwisko;
        int nr_dzialu, wiek, dzieci;
        float placa;
        char plec;
        boolean stan_cywilny;

        System.out.println("podaj imie:");
        imie = cin.nextLine();
        System.out.println("podaj nazwisko:");
        nazwisko = cin.nextLine();
        System.out.println("podaj płeć(M - mężczyzna, K - Kobieta)");
        plec = cin.nextLine().charAt(0);
        System.out.println("podaj nr działu:");
        nr_dzialu = cin.nextInt();
        System.out.println("podaj placa:");
        placa = cin.nextFloat();
        System.out.println("podaj wiek:");
        wiek = cin.nextInt();
        System.out.println("podaj dzieci");
        dzieci = cin.nextInt();
        System.out.println("podaj stan cywilny:(true - Tak, false - Nie)");
        stan_cywilny = cin.nextBoolean();

        Firma pracownik = new Firma(nr, imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
        this.lista[licznik] = pracownik;
        licznik++;
    }

    public void delete_employe(int szukany){

        for(int i = 0; i < licznik; i++){
            if(szukany == this.lista[i].getNr())
                if(this.lista[i] != null)
                    this.lista[i] = null;
                else
                    break;
        }
    }


    ////konstruktor
    public Lista_pracownikow(){this(domyślny_rozmiar_listy);}

    public Lista_pracownikow(int rozmiar){
        this.rozmiar = rozmiar;
        lista = new Firma[rozmiar];

        Firma Ja = new Firma(0,"Krzysztof", "Kozłowski", 'M', 12, 2500, 26, 0, false);
        lista[licznik++] = Ja;
    }
    //////////////////////

    //////////settery i gettery
    public static int getDomyślny_rozmiar_listy() {
        return domyślny_rozmiar_listy;
    }

    public Firma[] getLista() {
        return lista;
    }

    public void setLista(Firma[] lista) {
        this.lista = lista;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }
}
