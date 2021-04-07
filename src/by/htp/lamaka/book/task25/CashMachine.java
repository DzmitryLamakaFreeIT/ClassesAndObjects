package by.htp.lamaka.book.task25;

public class CashMachine {
    /*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
            50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    снимающую деньги. На вход передается сумма денег. На выход – булевское
    значение (операция удалась или нет). При снятии денег функция должна
    рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
    конструктор с тремя параметрами – количеством купюр.*/
    private int cash;
    private int countCashOf20;
    private int countCashOf50;
    private int countCashOf100;

    public CashMachine() {

    }

    public CashMachine(int countCashOf20, int countCashOf50, int countCashOf100) {
        this.countCashOf20 = countCashOf20;
        this.countCashOf50 = countCashOf50;
        this.countCashOf100 = countCashOf100;
        cash = countCashOf20 * 20 + countCashOf50 * 50 + countCashOf100 * 100;
    }

    public boolean addCash(int cash) {
        boolean result;
        if (cash <= 0) {
            result = false;
        } else {
            this.cash += cash;
            result = true;
        }
        return result;
    }

    public int checkBalance() {
        return cash;
    }

    public boolean withdrawMoney(int cash) {
        boolean result = false;
        if (cash > this.cash || cash < 20 || cash < 0) {
            result = false;
            return result;
        } else if (cash % 100 == 0 && cash / 100 > countCashOf100) {
            this.cash -= cash;
            countCashOf100 -= cash / 100;
            result = true;
            printCashForWithdrawMoney(cash, 0, 0, cash / 100);
            return result;
        } else if (cash % 50 == 0 && cash / 50 > countCashOf50) {
            this.cash -= cash;
            countCashOf50 -= cash / 50;
            result = true;
            printCashForWithdrawMoney(cash, 0, 0, cash / 50);
            return result;
        } else if (cash % 20 == 0 && cash / 20 > countCashOf20) {
            this.cash -= cash;
            countCashOf20 -= cash / 20;
            result = true;
            printCashForWithdrawMoney(cash, 0, 0, cash / 20);
            return result;
        } else {
            if ((cash % 100) % 50 == 0) {
                this.cash -= cash;
                countCashOf100 -= cash / 100;
                countCashOf50 -= (cash % 100) / 50;
                result = true;
                printCashForWithdrawMoney(cash, 0, (cash % 100) / 50, cash / 100);
                return result;
            } else if ((cash % 50) % 20 == 0) {
                this.cash -= cash;
                countCashOf50 -= cash / 50;
                countCashOf20 -= (cash % 50) / 20;
                result = true;
                printCashForWithdrawMoney(cash, (cash % 50) / 20, cash / 50, 0);
                return result;
            } else {
                result = false;
            }
        }
        if (result == false) {
            System.out.println("Withdraw money was failed");
        }
        return result;
    }

    public void printCashForWithdrawMoney(int cash, int countCashOf20, int countCashOf50, int countCashOf100) {
        System.out.println("Withdraw Money: " + cash + "\n20$ - " + countCashOf20 + "\n50$ - " + countCashOf50 +
                "\n100$ - " + countCashOf100 + "\naccount balance: " + this.cash);
    }

}
