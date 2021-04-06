package by.htp.lamaka.transport;

import java.util.Objects;

public class MilitaryTransport extends AirTransport {
    private boolean isEjectionSystem;
    private int numberOfMissiles;

    public MilitaryTransport() {
    }

    public MilitaryTransport(double power, double maxSpeed, double weight, String brand, double wingspan,
                             double minRunwayLenForTakeOff, boolean isEjectionSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLenForTakeOff);
        this.isEjectionSystem = isEjectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isEjectionSystem() {
        return isEjectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    @Override
    public String getAllChars() {
        return "Мощность : " + this.getPower() + " л.с. (" + this.getPower() * 0.74 + " кВ)\n" +
                "Максимальная скорость : " + this.getMaxSpeed() + " км/ч \n" +
                "Вес : " + this.getWeight() + " кг \n" +
                "Марка : " + this.getBrand() + " \n" +
                "Мин. длина взлетной полосы : " + this.getMinRunwayLenForTakeOff() + " м \n" +
                "Размах крыльев : " + this.getWingspan() + " м \n" +
                "Наличие системы катапультирования : " + this.isEjectionSystem + "\n" +
                "Кол-во ракет : " + this.numberOfMissiles + " шт.\n";
    }

    public String toShot() {
        String result;

        if (numberOfMissiles == 0) {
            result = "Боеприпасы отсутствуют";
        } else {
            result = "Ракета пошла…";
        }

        return result;
    }

    public String toEjection() {
        String result;

        if (isEjectionSystem == true) {
            result = "Катапультирование прошло успешно!";
        } else {
            result = "У вас нет такой системы!";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryTransport that = (MilitaryTransport) o;
        return isEjectionSystem == that.isEjectionSystem && numberOfMissiles == that.numberOfMissiles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEjectionSystem, numberOfMissiles);
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "isEjectionSystem=" + isEjectionSystem +
                ", numberOfMissiles=" + numberOfMissiles +
                '}';
    }
}
