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
    public void printmenu(int nr){
        int n = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("podaj n:\n1 - lista pracowników\n2 - dodanie pracownika\n3 - usunięcie pracownika");
        n = cin.nextInt();

        switch (n){
            case 1:
                lista.printlista();
                break;
            case 2:
                String imie, nazwisko;
                int nr_dzialu, wiek, dzieci;
                float placa;
                char plec;
                boolean stan_cywilny;

                System.out.println("podaj imie:");
                imie = cin.nextLine();
                System.out.println("podaj nazwisko:");
                nazwisko = cin.nextLine();
                System.out.println("podaj płeć(M - mężczyzna, K - Kobieta");
                plec = cin.next().charAt(0);
                if(plec != 'M' & plec != 'K' & plec != 'm' & plec != 'k')
                    break;
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

                Firma pracownik = new Firma(nr,imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
                lista.add_employe(pracownik);
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
    }

    public Lista_pracownikow getLista() {
        return lista;
    }

    public void setLista(Lista_pracownikow lista) {
        this.lista = lista;
    }
}
