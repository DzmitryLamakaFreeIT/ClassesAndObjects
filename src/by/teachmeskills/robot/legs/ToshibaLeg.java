package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba сделали шаг вперед");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
