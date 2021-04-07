package by.lamaka.lesson6.account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, 5000);

        account.adding(300);
        account.adding(400);
        account.adding(200);

        System.out.println(account.getBalance());
        System.out.println(account.showAddingLog());

        account.payment(150);
        account.payment(130);
        account.payment(1900);

        System.out.println(account.getBalance());
        System.out.println(account.showPaymentLog());

        account.withdraw(120);
        account.withdraw(1200);
        account.withdraw(240);

        System.out.println(account.getBalance());
        System.out.println(account.showWithdrawLog());

    }
}
