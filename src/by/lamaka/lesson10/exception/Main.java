package by.lamaka.lesson10.exception;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 220, 45000);
        Car audi = new Car("AUDI", 210, 36000);

        try {
            bmw.startEngine();
        } catch (StartException e) {
            System.out.println("У автомобиля " + bmw.getBrand() +" что-то пошло не так!");
        }
        try {
           audi.startEngine();
        } catch (StartException e) {
            System.out.println("У автомобиля " + audi.getBrand() +" что-то пошло не так!");
        }
    }
}
