package by.lamaka.lesson6.account;

public class Account {
    /*3. Создать класс Account с внутренним классом, с помощью объектов которо-
    го можно хранить информацию обо всех операциях со счетом (снятие, пла-
            тежи, поступления).*/
    private int id;
    private int balance;
    private AccountLog accountLog;

    public Account() {
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        accountLog = new AccountLog();
    }

    public int getBalance() {
        return balance;
    }

    class AccountLog {
        private String withdrawLog;
        private String paymentLog;
        private String addingLog;

        {
            withdrawLog = "";
            paymentLog = "";
            addingLog = "";
        }

        private void addWithdrawLog(int cash) {
            withdrawLog += "Withdraw " + cash + "\n";

        }

        private void addPaymentLog(int cash) {
            paymentLog += "Payment " + cash + "\n";
        }

        private void addAddingLog(int cash) {
            addingLog += "Adding " + cash + "\n";
        }
    }

    public void withdraw(int cash) {
        balance -= cash;
        accountLog.addWithdrawLog(cash);
    }

    public void payment(int cash) {
        balance -= cash;
        accountLog.addPaymentLog(cash);
    }

    public void adding(int cash) {
        balance += cash;
        accountLog.addAddingLog(cash);
    }

    public String showWithdrawLog() {
        return accountLog.withdrawLog;
    }

    public String showPaymentLog() {
        return accountLog.paymentLog;
    }

    public String showAddingLog() {
        return accountLog.addingLog;
    }

}
