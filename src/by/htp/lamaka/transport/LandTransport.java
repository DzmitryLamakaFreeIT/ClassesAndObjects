package by.htp.lamaka.transport;

public abstract class LandTransport extends Transport{
    private int countOfWheels;
    private double fuelConsumption;

    public LandTransport() {
    }

    public LandTransport(double power, double maxSpeed, double weight, String brand, int countOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
