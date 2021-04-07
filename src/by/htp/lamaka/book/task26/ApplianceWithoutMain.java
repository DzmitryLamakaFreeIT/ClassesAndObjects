package by.htp.lamaka.book.task26;

import java.util.Objects;

public abstract class ApplianceWithoutMain extends Appliance {
    private int batteryCapacity;
    private boolean isCharging;

    public ApplianceWithoutMain() {

    }

    public ApplianceWithoutMain(String manufacturer, int batteryCapacity) {
        super(manufacturer);
        this.batteryCapacity = batteryCapacity;
        isCharging = false;

    }

    public void putOnCharge() {
        isCharging = true;
    }

    public void putOffCharge() {
        isCharging = false;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public boolean isCharging() {
        return isCharging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApplianceWithoutMain that = (ApplianceWithoutMain) o;
        return batteryCapacity == that.batteryCapacity && isCharging == that.isCharging;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, isCharging);
    }

    @Override
    public String toString() {
        return "ApplianceWithoutMain{" +
                "batteryCapacity=" + batteryCapacity +
                ", isCharging=" + isCharging +
                '}';
    }
}
