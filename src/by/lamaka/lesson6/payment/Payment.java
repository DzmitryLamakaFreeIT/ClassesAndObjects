package by.lamaka.lesson6.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    /*2. Создать класс Payment с внутренним классом, с помощью объектов кото-
    рого можно сформировать покупку из нескольких товаров.*/
    private int cost;
    private List<Product> products;

    public Payment() {
        products = new ArrayList<Product>();
    }

    public Payment(List<Product> products) {
        this.products = products;
    }

    class Product {
        private String name;
        private int price;

        private Product() {
        }

        private Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

    }

    public void addProduct(String name, int price) {
        products.add(new Product(name, price));
        cost += price;
    }

    public int getCost() {
        return cost;
    }

    public String viewListOfProducts(){
        String result = "";

        for (Product product: products) {
            result += product.name + " " + product.price + "\n";
        }

        return result;
    }
}
