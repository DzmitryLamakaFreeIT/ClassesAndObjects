package by.htp.lamaka.book.task27;

public class Main {
    /*Создать иерархию классов, описывающих банковские карточки.
    Иерархия должна иметь хотя бы три уровня.*/
    public static void main(String[] args) {
        Halva halva = new Halva(1, 0, 24);
        HalvaPlus halvaPlus = new HalvaPlus(2, 7861, 0);

        System.out.println("credit balance " + halva.getCreditBalance());
        System.out.println("take credit 1000 " + halva.takeCredit(1000));
        System.out.println("credit balance " + halva.getCreditBalance());
        System.out.println("repay part of credit 500 " + halva.repayPartOfCredit(500));
        System.out.println("credit balance " + halva.getCreditBalance());

        System.out.println("**********************");

        System.out.println("balance " + halvaPlus.getBalance() + " | bonus points " + halvaPlus.getBonusPoints());
        System.out.println("withdraw cash 1340 " + halvaPlus.withdrawСash(1340));
        System.out.println("balance " + halvaPlus.getBalance() + " | bonus points " + halvaPlus.getBonusPoints());
        System.out.println("buy with salary card for 1500 " + halvaPlus.buyWithSalaryCard(1500));
        System.out.println("balance " + halvaPlus.getBalance() + " | bonus points " + halvaPlus.getBonusPoints());

    }
}
