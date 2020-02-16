package pl.sda.zajęcia6.Pracownicy;

public class Lista_pracownikow {
    private final static int domyślny_rozmiar_listy = 100;
    private Firma[] lista;
    private int rozmiar;
    private int licznik;

    ///////////
    ////metody
    ///////////

    public void printlista(){
        for(int i = 0; i < licznik; i++){
            lista[i].display_employe();
        }
    }

    public void add_employe(Firma pracownik){
        this.lista[licznik] = pracownik;
        licznik++;
    }

    public void delete_employe(int nr){
        this.lista[nr] = null;
    }


    ////konstruktor
    public Lista_pracownikow(){this(domyślny_rozmiar_listy);}

    public Lista_pracownikow(int rozmiar){
        this.rozmiar = rozmiar;
        lista = new Firma[rozmiar];
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
