package by.htp.lamaka.human.jacket;

public class SummerJacket  implements Jacket{
    public SummerJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел летнюю куртку");
    }

    @Override
    public void putOff() {
        System.out.println("Снял летнюю куртку");
    }
}
