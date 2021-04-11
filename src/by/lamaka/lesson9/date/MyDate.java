package by.lamaka.lesson9.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class MyDate {
    private static Date date;
    private static LocalDate localDate;
    private static SimpleDateFormat simpleDateFormat;
    private static DateTimeFormatter dateTimeFormatter;
    private static LocalDateTime localDateTime;

    public MyDate() {
    }

    static {
        date = new Date();
        localDate = LocalDate.now();
        simpleDateFormat = new SimpleDateFormat("", Locale.ENGLISH);
        localDateTime = LocalDateTime.now();
    }

    public static String getMonthWithDate(String myDate) {
        String result = "";
        try {
            simpleDateFormat.applyPattern("dd-MM-yyyy");
            date = simpleDateFormat.parse(myDate);
        } catch (ParseException e) {
            result = "Parse failed";
            return result;
        }
        simpleDateFormat.applyPattern("MMMM");
        result = simpleDateFormat.format(date);
        return result;
    }

    public static String getMonthWithLocalDate(String myDate) {
        String result = "";
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.parse(myDate, dateTimeFormatter);
        result = localDate.getMonth().toString();
        return result;
    }

    public static String getAgeByDate(String myDate) {
        String result = "";

        try {
            simpleDateFormat.applyPattern("dd-MM-yyyy");
            date = simpleDateFormat.parse(myDate);
        } catch (ParseException e) {
            result = "Parse failed";
            return result;
        }
        int year = (int) ((new Date().getTime() - date.getTime()) / (1000 * 60 * 60 * 24)) / 365;
        result = year + " years";

        return result;
    }

    public static String getAgeByLocalDate(String myDate) {
        String result = "";
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.parse(myDate, dateTimeFormatter);
        Period period = Period.between(localDate, LocalDate.now());
        result = period.getYears() + " years";
        return result;
    }

    public static String showDateWithTimeByLocalDateTime(String myDate) {
        String result = "";
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.parse(myDate, dateTimeFormatter);
        localDateTime = LocalDateTime.of(localDate, LocalTime.now());

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
        result = localDateTime.format(dateTimeFormatter);
        return result;
    }

    public static String showDateWithTimeByDate(String myDate) {
        String result = "";
        try {
            simpleDateFormat.applyPattern("dd-MM-yyyy");
            date = simpleDateFormat.parse(myDate);
        } catch (ParseException e) {
            result = "Parse failed";
            return result;
        }
        simpleDateFormat.applyPattern("dd/MM/YYYY hh:mm:ss");
        result = simpleDateFormat.format(date);

        return result;
    }
}
