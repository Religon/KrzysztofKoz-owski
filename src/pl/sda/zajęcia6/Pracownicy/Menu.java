package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Menu {
    private Lista_pracownikow lista;

    ////konstruktor
    public Menu(Lista_pracownikow lista) {
        this.lista = lista;
    }
    /////////////

    ////////////
    ////metody
    /////////////
    public void printmenu(){
        int n = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("podaj n:\n1 - lista pracowników\n2 - dodanie pracownika\n3 - usunięcie pracownika");
        n = cin.nextInt();
        switch (n){
            case 1:
                lista.printlista();
                break;
            case 2:
                Firma pracownik = new Firma("Krzysztof", "Kozłowski", 'M', 12, 2500, 26, 0, false);
                lista.add_employe(pracownik);
                break;
            case 3:
                int nr = 0;
                System.out.println("podaj nr do usunięcia:");
                nr = cin.nextInt();
                lista.delete_employe(nr);
                break;
            default:
                break;
        }
    }

    public Lista_pracownikow getLista() {
        return lista;
    }

    public void setLista(Lista_pracownikow lista) {
        this.lista = lista;
    }
}
