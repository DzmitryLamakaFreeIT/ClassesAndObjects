package by.htp.lamaka.book.task27;

import java.util.Objects;

public abstract class CreditCard extends Card {
    private double creditBalance;

    public CreditCard() {

    }

    public CreditCard(int id, int creditBalance) {
        super(id);
        this.creditBalance = creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public abstract boolean takeCredit(int cash);

    public boolean repayPartOfCredit(int cash) {
        boolean result;
        if (cash <= 0) {
            result = false;
        } else {
            result = true;
            creditBalance += cash;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditCard that = (CreditCard) o;
        return creditBalance == that.creditBalance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creditBalance);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditBalance=" + creditBalance +
                '}';
    }
}
