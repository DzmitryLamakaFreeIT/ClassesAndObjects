package by.htp.lamaka.book.task26;

import java.util.Objects;

public abstract class ApplianceForFood extends Appliance {
    private int powerConsumption;
    private boolean isOn;

    public ApplianceForFood() {

    }

    public ApplianceForFood(String manufacturer, int powerConsumption) {
        super(manufacturer);
        this.powerConsumption = powerConsumption;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApplianceForFood that = (ApplianceForFood) o;
        return powerConsumption == that.powerConsumption && isOn == that.isOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, isOn);
    }

    @Override
    public String toString() {
        return "ApplianceForFood{" +
                "powerConsumption=" + powerConsumption +
                ", isOn=" + isOn +
                '}';
    }
}
