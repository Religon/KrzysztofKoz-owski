package pl.sda.z_dom_na_7.Firma_new_version;

import java.util.Random;
import java.util.Scanner;

public class Lista_pracownikow {
    ///Pola
    private Pracownik [] lista = new Pracownik[100];
    private int licznik_pracownikow = 0;

    ///konstruktor


    public Lista_pracownikow() {
        Pracownik p = new Pracownik("Krzysztof", "Kozłowski", 'M', 1, 2500, 26, 0, false);
        lista[licznik_pracownikow] = p;
        licznik_pracownikow++;
    }

    ////metody
    ///1 - wyświetlanie wszystkich pracowników
    public void print_all(){
        for(int i = 0; i < (licznik_pracownikow); i++){
            if(lista[i] != null)
                System.out.println(lista[i].display_less(i));
            else
                System.out.println("Pusto.");
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
            index = Integer.parseInt(cin.nextLine()) - 1;
            lista[index] = null;
            System.out.println("Usunięto pracownika.");
            print_all();
            System.out.println();
            for(int  i = index; i < (lista.length-1); i++){
                lista[i] = lista[i+1];
            }
            print_all();
        }
        else {
            System.out.println("Lista jest pusta.");
        }


    }

    ///4 - edycja pracownika

    private void pole_do_edytowania(int index){
        int n = 0;
        Scanner cin = new Scanner(System.in);
        String koniec = "";

        while(!koniec.equals("t")) {
            System.out.println("podaj pole do edycji\n" +
                    "1 - nazwisko(kobieta)\n" +
                    "2 - nr działu\n" +
                    "3 - placa\n" +
                    "4 - wiek\n" +
                    "5 - dzieci\n" +
                    "6 - stan cywilny\n");
            n = cin.nextInt();
            System.out.println("Zmień:");
            switch (n) {
                case 1:
                    if(lista[index].getPlec() == 'K'){
                        String nazwisko = cin.nextLine();
                        lista[index].setNazwisko(nazwisko);
                    }
                    else
                        System.out.println("Tylko kobiet mogą zmienić nazwisko!");
                    break;
                case 2:
                    int nr_dzialu = cin.nextInt();
                    lista[index].setNr_dzialu(nr_dzialu);
                    break;
                case 3:
                    float placa = cin.nextFloat();
                    lista[index].setPlaca(placa);
                    break;
                case 4:
                    int wiek = cin.nextInt();
                    lista[index].setWiek(wiek);
                    break;
                case 5:
                    int dzieci = cin.nextInt();
                    lista[index].setDzieci(dzieci);
                    break;
                case 6:
                    boolean stan = cin.nextBoolean();
                    lista[index].setStan_cywilny(stan);
                    break;

                default:
                    break;
            }

            cin.nextLine();
            System.out.println("podaj t by zakończyć edycję");
            koniec = cin.nextLine();
            System.out.println(koniec);
        }

    }
    public void edycja_pracownika(){
        Scanner cin = new Scanner(System.in);
        int suma_pracownikow = ile_mamy_pracownikow(), index = 0;

        if(suma_pracownikow > 0){
            System.out.println("Podaj index pracownika do edycji:");
            index = Integer.parseInt(cin.nextLine())-1;
            lista[index].display_pracownik();

            pole_do_edytowania(index);
            System.out.println("Z edytownao pracownika.");
        }
        else {
            System.out.println("Lista jest pusta.");
        }
    }

    ///5 - dodatkowe funkcje
    public void dodatkowe_funkcje(){

    }

    ///6 - Zapis do pliku
    public String getPracownik(int i){
        return lista[i].display_less(i);
    }


    ///99 - generator pracownikow

    public void generator_pracownikow(){
        Random losowanie = new Random();
        String []imiona_męskie = {"Krzysztof", "Adam", "Paweł", "Filip", "Piotr", "Jerzy", "Robert", "Mateusz", "Jan"};
        String []imiona_damskie = {"Karolina", "Agnieszka", "Ewa", "Małgorzata", "Maja", "Natalia", "Krzystofia", "Anna"};
        String []nazwiska = {"Kozłowski", "Kowalski", "Adamczeski", "Czepielewski", "Tokarczyk", "Piekara","Glas"};

        String imie, nazwisko;
        char plec;
        int nr_dzialu, wiek, dzieci;
        float placa;
        boolean stan_cywilny;

        for(int i = 1; i < 100; i++) {
            if (losowanie.nextInt() == 0) {
                plec = 'M';
                imie = imiona_męskie[losowanie.nextInt(imiona_męskie.length)];

            } else {
                plec = 'K';
                imie = imiona_damskie[losowanie.nextInt(imiona_damskie.length)];
            }

            nazwisko = nazwiska[losowanie.nextInt(nazwiska.length)];
            nr_dzialu = losowanie.nextInt(10);
            wiek = losowanie.nextInt(65 - 18) + 18;
            dzieci = losowanie.nextInt(5);
            placa = (float) (losowanie.nextInt(5000) + 1500);
            if (losowanie.nextBoolean()) stan_cywilny = true;
            else stan_cywilny = false;

            lista[i] = new Pracownik(imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
            licznik_pracownikow++;
        }
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
