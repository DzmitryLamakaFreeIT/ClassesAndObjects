package by.htp.lamaka.transport;

public abstract class AirTransport extends Transport{
    private double wingspan;
    private double minRunwayLenForTakeOff;

    public AirTransport() {
    }

    public AirTransport(double power, double maxSpeed, double weight, String brand, double wingspan, double minRunwayLenForTakeOff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLenForTakeOff = minRunwayLenForTakeOff;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getMinRunwayLenForTakeOff() {
        return minRunwayLenForTakeOff;
    }
}
