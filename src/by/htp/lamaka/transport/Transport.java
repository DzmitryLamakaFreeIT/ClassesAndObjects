package by.htp.lamaka.transport;

public abstract class Transport {
    private double power;
    private double maxSpeed;
    private double weight;
    private String brand;

    public Transport(){}

    public Transport(double power, double maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract String getAllChars();

    public double getPower() {
        return power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }
}
