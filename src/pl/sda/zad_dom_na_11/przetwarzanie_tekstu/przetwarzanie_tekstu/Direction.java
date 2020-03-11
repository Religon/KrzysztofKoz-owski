package pl.sda.zad_dom_na_11.przetwarzanie_tekstu.przetwarzanie_tekstu;

public enum Direction {
    NORTH(1), WEST(-1), EAST(1), SOUTH(-1);
    private int n;

    private Direction(int n){
        this.n = n;
    }

    public int getDirection(){
        return n;
    }
}
