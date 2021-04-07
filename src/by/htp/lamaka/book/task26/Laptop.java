package by.htp.lamaka.book.task26;

import java.util.Objects;

public class Laptop extends ApplianceWithoutMain {
    private String os;
    private double cpu;

    public Laptop() {

    }

    public Laptop(String manufacturer, int batteryCapacity, String os, double cpu) {
        super(manufacturer, batteryCapacity);
        this.os = os;
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public double getCpu() {
        return cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cpu, cpu) == 0 && Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), os, cpu);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", cpu=" + cpu +
                '}';
    }
}
