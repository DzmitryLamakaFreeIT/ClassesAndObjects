package by.lamaka.lesson10.exception;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int cost;

    public Car() {
    }

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void startEngine() throws StartException {
        if (new Random().nextInt(21) % 2 == 0) {
            throw new StartException();
        } else {
            System.out.println("Автомобиль " + brand + " завелся успешно!");
        }
    }
}
