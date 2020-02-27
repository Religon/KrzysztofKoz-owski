package pl.sda.zajęcia6.Lista;

public class Lista {
    private int [] liczby;
    private int pojemnosc;
    private int rozmiar;

    /////////////
    ///metody
    //////////////
    public void dodajElement(){

    }

    public void znajdz(){

    }

    public void pisz(){

    }

    public void usunPierwszy(){

    }

    public void usunPowtorzenia(){

    }

    public void odroc(){

    }
    //////////
    ///konstruktor
    ///////////

    public Lista(int pojemnosc){
        this.pojemnosc = pojemnosc;
    }

    ////////////
    ///settery i  gettery
    /////////////


    public int[] getLiczby() {
        return liczby;
    }

    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}
