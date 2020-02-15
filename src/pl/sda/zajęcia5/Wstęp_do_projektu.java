package pl.sda.zajęcia5;

public class Wstęp_do_projektu {
    // Pierwsze przykłady tworzenia obiektów.
    public static void main(String[] args) {
        //Student jest obiektem typu Osoba
        //wywołanie konstruktora bezparametrowego Osoba ---->
        Osoba student = new Osoba(); //tworzenie obiektu
        student.imie = "Piotr";
        student.nazwisko = "Kowalski";
        student.waga = 80;
        student.wiek = 26;
        student.wzrost = 1.86;

        //Uczeń jest obiektem typu Osoba
        Osoba uczeń = new Osoba();
        /*uczeń.imie = "Anna";
        uczeń.nazwisko = "Nowak";
        uczeń.wiek = 15;*/

        //Odczyt Pola
        String a = student.imie;
        System.out.print(a + " ");
        System.out.println(student.nazwisko +" waga:"+ student.waga);

        //Wartości drugiego obiektu
        System.out.println(uczeń.imie + " " + uczeń.nazwisko + " wiek:" + student.wiek);

        //Zmiana nazwiska Studenta
        student.nazwisko = "dsahdvjhsav";
        System.out.println(student.nazwisko + " "  + uczeń.nazwisko);

        //tworzymy obiekty z użyciem konstruktora parametrowego

        Osoba pracownik = new Osoba("Anna", "Adamiak", 28);
        System.out.println(pracownik.imie + " " + pracownik.nazwisko + " " + pracownik.wiek);


        // wywołujemy metodę przedstaw_sie
        System.out.println(student.przedstaw_sie());
        System.out.println(uczeń.przedstaw_sie());
        System.out.println(pracownik.przedstaw_sie());

    }
}
