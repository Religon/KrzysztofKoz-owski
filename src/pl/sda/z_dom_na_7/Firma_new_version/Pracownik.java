package pl.sda.z_dom_na_7.Firma_new_version;

public class Pracownik {
    ///Pola
    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;

    ////Metody

    public void display_pracownik(){
        System.out.println(", imie:'" + imie + '\'' +
                ", nazwisko:'" + nazwisko + '\'' +
                ", plec:" + plec +
                ", nr_dzialu:" + nr_dzialu +
                ", placa:" + placa +
                ", wiek:" + wiek +
                ", dzieci:" + dzieci +
                ", stan_cywilny:" + stan_cywilny);
    }

    public void display_less(int i){
        System.out.println( (i+1) +  " " + imie + " " + nazwisko +" - " + placa);
    }

    public  void special_display(){
        ///z dużych liter
        System.out.println( imie.toUpperCase() + " " + nazwisko.toUpperCase());
    }

    public boolean spr_pensje(float wartosc){
        if(this.placa > wartosc)
            return true;
        else
            return false;
    }

    public void podwyzka(float procent_podwyzki){
        float pensja = 0;
        if(this.stan_cywilny == true)
            pensja = (float)(this.placa + 0.02 * (float)this.dzieci + 0.03)*procent_podwyzki;
        else
            pensja = (float)(this.placa + 0.02 * (float)this.dzieci)*procent_podwyzki;
    }


    ////Konstruktor

    public Pracownik( String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek, int dzieci, boolean stan_cywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }


    ////Settery i gettery
    public  String getImie(){
        return  imie;
    }

    public void setImie(String imie){
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
