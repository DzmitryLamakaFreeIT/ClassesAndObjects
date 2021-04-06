package by.htp.lamaka.book.task27;

import java.util.Objects;

public class Halva extends CreditCard {
    private int creditPercentage;

    public Halva() {

    }

    public Halva(int id, int creditBalance, int creditPercentage) {
        super(id, creditBalance);
        this.creditPercentage = creditPercentage;
    }

    public int getCreditPercentage() {
        return creditPercentage;
    }

    @Override
    public boolean takeCredit(int cash) {
        boolean result;
        if (cash > 100000) {
            result = false;
        } else {
            result = true;
            this.setCreditBalance(this.getCreditBalance() - (cash + cash * ((double) creditPercentage / 100)));

        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Halva halva = (Halva) o;
        return creditPercentage == halva.creditPercentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creditPercentage);
    }

    @Override
    public String toString() {
        return "Halva{" +
                "creditPercentage=" + creditPercentage +
                '}';
    }
}
