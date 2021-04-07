package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги Samsung сделали шаг вперед");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
