package by.htp.lamaka.book.task24;

public class IntervalTime {
    /*Создать класс и объекты описывающие промежуток времени. Сам промежуток
    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения
    двух объектов (метод должен работать аналогично compareTo в строках). Создать
    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.*/
    private int hour;
    private int second;
    private int minute;

    public IntervalTime(int fullTimeInSeconds) {
        if (fullTimeInSeconds < 0) {
            hour = 0;
            minute = 0;
            second = 0;
        } else {
            second = (fullTimeInSeconds % 3600) % 60;
            minute = (fullTimeInSeconds % 3600) / 60;
            hour = fullTimeInSeconds / 3600;
        }

    }

    public IntervalTime(int hour, int minute, int second) {
        if (hour < 0 || minute < 0 || second < 0) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else if (second > 59 || minute > 59) {
            int seconds = hour * 3600 + minute * 60 + second;
            this.second = (seconds % 3600) % 60;
            this.minute = (seconds % 3600) / 60;
            this.hour = seconds / 3600;

        }
    }

    public int getFullTimeInSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public String compareToTime(IntervalTime intervalTime) {
        String result;
        if (this.getFullTimeInSeconds() > intervalTime.getFullTimeInSeconds()) {
            result = this.printIntervalTime() + " more than " + intervalTime.printIntervalTime();
        } else if (this.getFullTimeInSeconds() == intervalTime.getFullTimeInSeconds()) {
            result = this.printIntervalTime() + " equals " + intervalTime.printIntervalTime();
        } else {
            result = this.printIntervalTime() + " less than " + intervalTime.printIntervalTime();
        }
        return result;
    }

    public String printIntervalTime() {
        return "| " + hour + " h. " + minute + " min. " + second + " sec. |";
    }
}

