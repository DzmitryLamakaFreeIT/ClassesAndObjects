package by.lamaka.lesson6.film;

public class Main {
    public static void main(String[] args) {
        Film film  = new Film("T-34","military",117,"Alexey Sidorov");

        System.out.println(film.getAllInfo());

        film.addProducer("Vasya Sidorov");

        System.out.println(film.getAllInfo());

    }
}
