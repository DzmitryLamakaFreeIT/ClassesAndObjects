package by.htp.lamaka.book.task26;

public class ApplianceView {
    public static void printAppliance(Oven oven) {
        System.out.println("Oven : manufacturer - " + oven.getManufacturer() + " ; capacity - " + oven.getCapacity()
                + " ; power consumption - " + oven.getPowerConsumption());
    }

    public static void printAppliance(Laptop laptop) {
        System.out.println("Laptop : manufacturer - " + laptop.getManufacturer() + " ; battery capacity - " +
                laptop.getBatteryCapacity() + " ; CPU - " + laptop.getCpu() + " ; OS - " + laptop.getOs());
    }

    public static void printAppliance(Refrigerator refrigerator) {
        System.out.println("Refrigerator : manufacturer - " + refrigerator.getManufacturer() + " ; freezer capacity - "
                + refrigerator.getFreezerCapacity()
                + " ; power consumption - " + refrigerator.getPowerConsumption());
    }

    public static void printAppliance(TabletPC tabletPC) {
        System.out.println("TabletPC : manufacturer - " + tabletPC.getManufacturer() + " ; battery capacity - " +
                tabletPC.getBatteryCapacity() + " ; flash memory capacity - " + tabletPC.getFlashMemoryCapacity() +
                " ; inches - " + tabletPC.getInches());
    }

}
