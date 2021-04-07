package by.htp.lamaka.transport;

import java.util.Objects;

public class FreightTransport extends LandTransport {
    private double carryingCapacity;

    public FreightTransport() {
    }

    public FreightTransport(double power, double maxSpeed, double weight, String brand, int countOfWheels, double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String getAllChars() {
        return "Мощность : " + this.getPower() + " л.с. (" + this.getPower() * 0.74 + " кВ)\n" +
                "Максимальная скорость : " + this.getMaxSpeed() + " км/ч \n" +
                "Вес : " + this.getWeight() + " кг \n" +
                "Марка : " + this.getBrand() + "\n" +
                "Кол-во колес : " + this.getCountOfWheels() + " шт. \n" +
                "Расход топлива : " + this.getFuelConsumption() + " л/100км \n" +
                "Грузоподъемность: " + this.carryingCapacity + " т\n";
    }

    public String checkAbilityToTransportByWeight(double weight) {
        String result;

        if (weight > this.carryingCapacity) {
            result = "Вам нужен грузовик побольше!";
        } else if (weight <= 0) {
            result = "Неправильный вес груза!";
        } else {
            result = "Грузовик загружен";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreightTransport that = (FreightTransport) o;
        return Double.compare(that.carryingCapacity, carryingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carryingCapacity);
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
