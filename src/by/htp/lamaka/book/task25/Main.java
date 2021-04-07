package by.htp.lamaka.book.task25;

public class Main {
    /*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
            50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    снимающую деньги. На вход передается сумма денег. На выход – булевское
    значение (операция удалась или нет). При снятии денег функция должна
    рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
    конструктор с тремя параметрами – количеством купюр.*/
    public static void main(String[] args) {
        CashMachine atm = new CashMachine(10,6,4);
        System.out.println(atm.checkBalance());

        atm.addCash(230);
        System.out.println(atm.checkBalance());

        atm.withdrawMoney(200);
        atm.withdrawMoney(15);
        atm.withdrawMoney(70);
        atm.withdrawMoney(150);
        atm.withdrawMoney(710);


    }
}
