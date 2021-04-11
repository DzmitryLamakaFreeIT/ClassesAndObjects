package by.lamaka.lesson9.date;


public class Test {
    public static void main(String[] args) {
        String str = "20-07-1995";
        System.out.println(MyDate.getMonthWithDate(str));
        System.out.println(MyDate.getMonthWithLocalDate(str));
        System.out.println(MyDate.getAgeByDate(str));
        System.out.println(MyDate.getAgeByLocalDate(str));
        System.out.println(MyDate.showDateWithTimeByLocalDateTime(str));
        System.out.println(MyDate.showDateWithTimeByDate(str));


    }
}
