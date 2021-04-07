package by.htp.lamaka.transport;

import java.util.Objects;

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean isBusinessClass;

    public CivilTransport() {
    }

    public CivilTransport(double power, double maxSpeed, double weight, String brand, double wingspan,
                          double minRunwayLenForTakeOff, int numberOfPassengers, boolean isBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLenForTakeOff);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    @Override
    public String getAllChars() {
        return "Мощность : " + this.getPower() + " л.с. (" + this.getPower() * 0.74 + " кВ)\n" +
                "Максимальная скорость : " + this.getMaxSpeed() + " км/ч \n" +
                "Вес : " + this.getWeight() + " кг \n" +
                "Марка : " + this.getBrand() + "\n" +
                "Мин. длина взлетной полосы : " + this.getMinRunwayLenForTakeOff() + " м \n" +
                "Размах крыльев : " + this.getWingspan() + " м \n" +
                "Кол-во пасссажиров : " + this.getNumberOfPassengers() + " ч \n" +
                "Наличие бизнес класса : " + this.isBusinessClass + " \n";
    }

    public String checkAbilityToTransportByCountOfPassengers(int numberOfPassengers) {
        String result;

        if (numberOfPassengers > this.numberOfPassengers) {
            result = "Вам нужен самолет побольше!";
        } else if (numberOfPassengers <= 0) {
            result = "Неправильно задано кол-во пассажиров";
        } else {
            result = "Самолет загружен!";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CivilTransport that = (CivilTransport) o;
        return numberOfPassengers == that.numberOfPassengers && isBusinessClass == that.isBusinessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPassengers, isBusinessClass);
    }

    @Override
    public String toString() {
        return "CivilTransport{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", isBusinessClass=" + isBusinessClass +
                '}';
    }
}
