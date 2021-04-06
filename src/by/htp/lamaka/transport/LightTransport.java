package by.htp.lamaka.transport;

import java.util.Objects;

public class LightTransport extends LandTransport {
    private String bodyType;
    private int numberOfPassengers;

    public LightTransport() {
    }

    public LightTransport(double power, double maxSpeed, double weight, String brand, int countOfWheels,
                          double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public String getAllChars() {
        return "Мощность : " + this.getPower() + " л.с. (" + this.getPower() * 0.74 + " кВ)\n" +
                "Максимальная скорость : " + this.getMaxSpeed() + " км/ч \n" +
                "Вес : " + this.getWeight() + " кг \n" +
                "Марка : " + this.getBrand() + "\n" +
                "Кол-во колес : " + this.getCountOfWheels() + " шт. \n" +
                "Расход топлива : " + this.getFuelConsumption() + " л/100км \n" +
                "Тип кузова : " + this.bodyType + " \n" +
                "Кол-во пассажиров : " + this.numberOfPassengers + " ч\n";
    }

    public String getFuelConsumptionByTime(int min) {
        String result;
        double distance;
        double countOfFuel;

        distance = (this.getMaxSpeed() / 60) * min;
        countOfFuel = getFuelConsumptionByDistance(distance);

        result = "За время " + min + " мин, автомобиль " + this.getBrand() + " двигаясь с максимальной скоростью " +
                this.getMaxSpeed() + " км/ч ,проедет " + distance + " км  и израсходует " + countOfFuel + " литров топлива.";


        return result;
    }

    private Double getFuelConsumptionByDistance(double distance) {
        double result;

        result = this.getFuelConsumption() / 100 * distance;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightTransport that = (LightTransport) o;
        return numberOfPassengers == that.numberOfPassengers && Objects.equals(bodyType, that.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType, numberOfPassengers);
    }

    @Override
    public String toString() {
        return "LightTransport{" +
                "bodyType='" + bodyType + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
