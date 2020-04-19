package pl.sda.zajęcia11;

public abstract class Human implements TwoLegged{
    @Override
    public void move() {
        System.out.println("ide sobie");
    }

    @Override
    public void wearShoes() {
        System.out.println("noszę buty");
    }
}
