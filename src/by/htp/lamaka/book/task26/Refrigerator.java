package by.htp.lamaka.book.task26;

import java.util.Objects;

public class Refrigerator extends ApplianceForFood {
    private int freezerCapacity;

    public Refrigerator() {

    }

    public Refrigerator(String manufacturer, int powerConsumption, int freezerCapacity) {
        super(manufacturer, powerConsumption);
        this.freezerCapacity = freezerCapacity;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return freezerCapacity == that.freezerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "freezerCapacity=" + freezerCapacity +
                '}';
    }
}
