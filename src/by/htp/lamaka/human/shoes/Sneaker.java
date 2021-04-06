package by.htp.lamaka.human.shoes;

public class Sneaker implements Shoe {

    public Sneaker() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кроссовки");
    }
}
