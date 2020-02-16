package pl.sda.zajęcia6.Pracownicy;

public class Menu {
    private final static int domyślny_rozmiar_listy = 100;
    private Firma[] lista;
    private int rozmiar;
    private int licznik;


    ////konstruktor
    public Menu(){this(domyślny_rozmiar_listy);}

    public Menu(int rozmiar){
        lista = new Firma[rozmiar];
    }
    //////////////////////

    ///////////
    ////metody
    ///////////
    public void add_employe(Firma pracownik){
        this.lista[licznik] = pracownik;
        licznik++;
    }

    public void delete_employe(Firma pracownik){
        this.lista[licznik] = null;
    }

    ////////////////
    //settery i gettery
    ////////////
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
}
