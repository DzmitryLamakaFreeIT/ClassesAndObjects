package by.htp.lamaka.human.pants;

public class SportsTrousers implements Pants {

    public SportsTrousers() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел спортивные штаны");
    }

    @Override
    public void putOff() {
        System.out.println("Снял спортивные штаны");
    }
}
