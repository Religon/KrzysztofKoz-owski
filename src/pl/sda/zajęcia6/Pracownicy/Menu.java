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
        int n = 0, nr = 1;
        Scanner cin = new Scanner(System.in);
        String linia = "";

        while(!linia.equals("q")){
            System.out.println("podaj n:\n1 - lista pracowników\n2 - dodanie pracownika\n3 - usunięcie pracownika");
            n = cin.nextInt();
            switch (n) {
                case 1:
                    System.out.println("indeks\timię\tnazwisko\tpłeć\tnr działu\tpłaca\twiek\tdzieci\tstan cywilny");
                    lista.printlista();
                    break;
                case 2:
                    lista.add_employe(nr);
                    nr++;
                    break;
                case 3:
                    System.out.println("podaj nr pracownika do usunięcia");
                    int i;
                    i = cin.nextInt();
                    lista.delete_employe(i);
                    break;
                default:
                    break;
            }
            cin.nextLine();
            System.out.println("by zakończyć wciśnij q, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);
        }

    }

    public Lista_pracownikow getLista() {
        return lista;
    }

    public void setLista(Lista_pracownikow lista) {
        this.lista = lista;
    }
}
