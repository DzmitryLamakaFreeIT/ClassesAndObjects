package by.htp.lamaka.human.jacket;

public class WinterJacket implements Jacket {

    public WinterJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел зимнюю куртку");
    }

    @Override
    public void putOff() {
        System.out.println("Снял зимнюю куртку");
    }
}
