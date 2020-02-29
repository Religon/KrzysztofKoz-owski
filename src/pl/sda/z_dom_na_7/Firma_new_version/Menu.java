package pl.sda.z_dom_na_7.Firma_new_version;

import java.util.Scanner;

public class Menu {

    private Lista_pracownikow lista;

    public Menu(Lista_pracownikow lista) {
        this.lista = lista;
    }

    public String printMenu(){
        Scanner cin = new Scanner(System.in);
        String linia = "";
        int n = 0;

        while(!linia.equals("q")) {
            System.out.println("podaj n:" +
                    "\n1 - lista pracowników" +
                    "\n2 - dodanie pracownika" +
                    "\n3 - usunięcie pracownika" +
                    "\n4 - edycja pracownika" +
                    "\n5 - dodatkowe funkcje" +
                    "\n99 - generator pracowników");

            n = cin.nextInt();

            switch (n) {
                case 1:
                    lista.print_all();
                    break;
                case 2:
                    lista.dodaj_pracownika();
                    break;
                case 3:
                    lista.usun_pracownika();
                    break;
                case 4:
                    lista.edycja_pracownika();
                    break;
                case 5:
                    lista.dodatkowe_funkcje();
                    break;
                case 99:
                    lista.generator_pracownikow();
                    break;
                default:
                    break;
            }


            cin.nextLine();
            System.out.println("by zakończyć wciśnij q, by kontynuować cokolowiek innego");
            linia = cin.nextLine();
            System.out.println(linia);
        }

        String listaP = null;

        for (int i = 0; i < lista.getLicznik_pracownikow(); i++) {
            listaP += lista.getPracownik(i);
        }
        return listaP;
    }

    public Lista_pracownikow getLista() {
        return lista;
    }

    public void setLista(Lista_pracownikow lista) {
        this.lista = lista;
    }
}
