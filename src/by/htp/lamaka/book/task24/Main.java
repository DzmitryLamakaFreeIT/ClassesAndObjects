package by.htp.lamaka.book.task24;

public class Main {
    /*Создать класс и объекты описывающие промежуток времени. Сам промежуток
    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения
    двух объектов (метод должен работать аналогично compareTo в строках). Создать
    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.*/
    public static void main(String[] args) {
        IntervalTime time1 = new IntervalTime(50045);
        IntervalTime time2 = new IntervalTime(14, 60, 0);

        System.out.println(time1.printIntervalTime());
        System.out.println(time2.printIntervalTime());

        System.out.println(time1.compareToTime(time2));


    }
}
