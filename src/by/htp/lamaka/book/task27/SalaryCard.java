package by.htp.lamaka.book.task27;

import java.util.Objects;

public abstract class SalaryCard extends Card {
    private int balance;

    public SalaryCard() {

    }

    public SalaryCard(int id, int balance) {
        super(id);
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean withdrawСash(int cash) {
        boolean result;
        if (cash > this.getBalance()) {
            result = false;
        } else {
            result = true;
            this.setBalance(this.getBalance() - cash);
        }
        return result;
    }

    public abstract boolean buyWithSalaryCard(int cash);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalaryCard that = (SalaryCard) o;
        return balance == that.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), balance);
    }

    @Override
    public String toString() {
        return "SalaryCard{" +
                "balance=" + balance +
                '}';
    }
}
