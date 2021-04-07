package by.lamaka.lesson6.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Cheese",32);
        payment.addProduct("Bread",20);
        payment.addProduct("Milk",23);

        System.out.println(payment.getCost());
        System.out.println(payment.viewListOfProducts());
    }
}
