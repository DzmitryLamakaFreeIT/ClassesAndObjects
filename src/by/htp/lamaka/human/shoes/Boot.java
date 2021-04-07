package by.htp.lamaka.human.shoes;

public class Boot implements Shoe{
    public Boot() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел ботинки");
    }

    @Override
    public void putOff() {
        System.out.println("Снял ботинки");
    }
}
