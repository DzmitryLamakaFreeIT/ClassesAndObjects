package by.htp.lamaka.book.task26;

import java.util.Objects;

public class TabletPC extends ApplianceWithoutMain {
    private double inches;
    private int flashMemoryCapacity;

    public TabletPC() {

    }

    public TabletPC(String manufacturer, int batteryCapacity, double inches, int flashMemoryCapacity) {
        super(manufacturer, batteryCapacity);
        this.inches = inches;
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public double getInches() {
        return inches;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.inches, inches) == 0 && flashMemoryCapacity == tabletPC.flashMemoryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inches, flashMemoryCapacity);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "inches=" + inches +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                '}';
    }
}
