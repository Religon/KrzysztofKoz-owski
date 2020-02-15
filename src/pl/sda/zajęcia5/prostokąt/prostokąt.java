package pl.sda.zajęcia5.prostokąt;

public class prostokąt {
    private int bokA;
    private int bokB;

    public prostokąt(int bokA, int bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int obliczPole(){
        return (this.bokA * this.bokB);
    }

    public int obliczObwod(){
        return (2*this.bokA + 2*this.bokB);
    }

    //getter i setter gdy użuwamy private

    // metoda gettera - zwraca wartość pola (nie przyjmuje argumentów)
    public int getBokA() {
        if(bokA > 0)
            return this.bokA;
        else
            throw new IllegalArgumentException("bok musi być większy od 0");
    }

    // metoda setter'a - nic nie zwraca, ustawia wartość przekazaną jako parametr
    public void setBokA(int bokA) {
        if(bokA > 0) this.bokA = bokA;
        else{
            throw new IllegalArgumentException("bok musi być większy od 0");
        }
    }

    public int getBokB() {
        return this.bokB;
    }

    public void setBokB(int bokB) {
        if(bokB > 0) this.bokB = bokB;
        else{
            throw new IllegalArgumentException("bok musi być większy od 0");
        }
    }
}
