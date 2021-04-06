package by.htp.lamaka.book.task26;

import java.util.Objects;

public abstract class Appliance {
    private String manufacturer;

    public Appliance() {

    }

    public Appliance(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(manufacturer, appliance.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
