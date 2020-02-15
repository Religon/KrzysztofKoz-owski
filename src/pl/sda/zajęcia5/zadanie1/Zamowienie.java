package pl.sda.zajęcia5.zadanie1;

public class Zamowienie {

    private final static int domyślny_rozmiar_zamówieneia = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maksRozmiar;

    public Zamowienie(){
        this(domyślny_rozmiar_zamówieneia); // wywołujemy konstruktor parametrowy
    }

    public Zamowienie(int maksRozmiar){
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja poz){
        if(this.ileDodanych >= maksRozmiar)
            System.out.println("nie można dodać zamówienia");
        else {
            this.pozycje[ileDodanych] = poz;
            ileDodanych++;
        }
    }

    public double obliczWartosc(){
        double suma = 0;
        for(Pozycja p : pozycje){
            if(p != null)
                suma += p.obliczWartosc();
        }
        return suma;
    }

    public String toString(){
        String result = "zamowienie: \n";
        System.out.println();
        for(int i = 0; i < ileDodanych; i++){
            result += pozycje[i].toString() + "\n";
        }
        return result;
    }

    public void usunPozycje(int index){

    }

    public void edytujPozycje(int indeks){

    }


    public Pozycja[] getPozycje() {
        return pozycje;
    }

    public void setPozycje(Pozycja[] pozycje) {
        this.pozycje = pozycje;
    }

    public int getIleDodanych() {
        return ileDodanych;
    }

    public void setIleDodanych(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }

    public int getMaksRozmiar() {
        return maksRozmiar;
    }

    public void setMaksRozmiar(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }
}
