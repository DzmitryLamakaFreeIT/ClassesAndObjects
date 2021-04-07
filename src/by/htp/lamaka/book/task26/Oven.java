package by.htp.lamaka.book.task26;

import java.util.Objects;

public class Oven extends ApplianceForFood {
    private int capacity;

    public Oven() {

    }

    public Oven(String manufacturer, int powerConsumption, int capacity) {
        super(manufacturer, powerConsumption);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return capacity == oven.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "capacity=" + capacity +
                '}';
    }
}
