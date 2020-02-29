package pl.sda.z_dom_na_7.zadanie1;

public class Kalkulator {
    ///Metody
    public Double dodawanie(double a, double b){
        return (a + b);
    }

    public Double odejmowanie(double a, double b){
        return (a - b);
    }

    public Double mnozenie(double a, double b){
        return (a * b);
    }

    public Double dzielenie(double a, double b){
        if(b != 0)
            return (a / b);
        else{
            System.out.println("Nie można dzielić przez 0!!!!");
            return 0.0;
        }
    }

    public Double modulo(double a, double b){
        if(b != 0)
            return (a % b);
        else{
            System.out.println("Nie można dzielić przez 0!!!!");
            return 0.0;
        }
    }

    ////konstruktor

    public Kalkulator() {
    }
}
