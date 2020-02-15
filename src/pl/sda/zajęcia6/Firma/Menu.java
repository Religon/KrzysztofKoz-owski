package pl.sda.zajęcia6.Firma;

import java.util.Scanner;

public class Menu {
    private final static int domyślny_rozmiar_listy = 100;
    private Firma[] lista;
    private int rozmiar;


    ////konstruktor
    public Menu(){this(domyślny_rozmiar_listy);}

    public Menu(int rozmiar){
        lista = new Firma[rozmiar];
    }
    //////////////////////

    ///////////
    ////metody
    ///////////


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
