package by.htp.lamaka.book.task26;

public class Main {
    /*Создать иерархию классов, описывающих бытовую технику. Создать несколько
    объектов описанных классов, часть из них включить в розетку.
    Иерархия должна иметь хотя бы три уровня.*/
    public static void main(String[] args) {
        Oven oven = new Oven("Lg", 1000, 30);
        TabletPC tabletPC = new TabletPC("Apple", 1500, 6, 10240);
        Refrigerator refrigerator = new Refrigerator("Samsung", 150, 200);
        Laptop laptop = new Laptop("Dell", 2000, "Windows", 4);

        oven.turnOn();
        System.out.println(oven.isOn());
        oven.turnOff();
        System.out.println(oven.isOn());

        tabletPC.putOnCharge();
        System.out.println(tabletPC.isCharging());
        tabletPC.putOffCharge();
        System.out.println(tabletPC.isCharging());

        ApplianceView.printAppliance(oven);
        ApplianceView.printAppliance(tabletPC);
        ApplianceView.printAppliance(refrigerator);
        ApplianceView.printAppliance(laptop);


    }
}
