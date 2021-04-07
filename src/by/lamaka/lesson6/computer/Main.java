package by.lamaka.lesson6.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung", "DX-10", "Windows",
                "Intel core i-5 10400f", "HyperX Fury 8 Gb");

        System.out.println(computer.getAllInfo());

        computer.setOs("Linux");

        System.out.println(computer.getAllInfo());


    }
}
