package by.htp.lamaka.human.pants;

public class Jeans implements Pants {
    public Jeans() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел джинсы");
    }

    @Override
    public void putOff() {
        System.out.println("Снял джинсы");
    }
}
