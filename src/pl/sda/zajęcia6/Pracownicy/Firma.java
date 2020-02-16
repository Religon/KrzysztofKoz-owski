package pl.sda.zajęcia6.Pracownicy;

import java.util.Scanner;

public class Firma {
    private int nr;
    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;

    /////////////////
    ///konstruktor
    /////////////
    public Firma(int nr, String imie, String nazwisko, char plec, int nr_dzialu, float placa,
                 int wiek, int dzieci, boolean stan_cywilny){
        this.nr = nr;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }

    /////////////////
    //metody
    //////////////

    public void display_employe(){
        System.out.println(this.nr + " " + this.imie + " " +this.nazwisko + " " + this.plec + " "
                + this.nr_dzialu + " " + this.placa + " " + this.wiek + " " + this.dzieci
                + " " + this.stan_cywilny );
    }

    public void display_less(){
        System.out.println(this.imie + " " +this.nazwisko + " " + this.placa);
    }

    public void display_special(){
        System.out.println(this.imie + " " +this.nazwisko);
    }
    public boolean pensja_ponizej(float wartosc){
        if(this.placa > wartosc)
            return true;
        else
            return false;
    }

    public float podwyzka(Firma osoba){
        float pensja = 0;
        if(this.stan_cywilny == true)
            pensja = (float)(this.placa + 0.02 * (float)this.dzieci + 0.03);
        else
            pensja = (float)(this.placa + 0.02 * (float)this.dzieci);
        return pensja;
    }

    //////////////////////////////
    //settery i gettery
    //////////////////////////////

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getNr_dzialu() {
        return nr_dzialu;
    }

    public void setNr_dzialu(int nr_dzialu) {
        this.nr_dzialu = nr_dzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDzieci() {
        return dzieci;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public boolean isStan_cywilny() {
        return stan_cywilny;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }
}
