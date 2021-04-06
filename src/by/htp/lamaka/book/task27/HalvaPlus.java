package by.htp.lamaka.book.task27;

import java.util.Objects;

public class HalvaPlus extends SalaryCard {
    private double bonusPoints;

    public HalvaPlus() {

    }

    public HalvaPlus(int id, int balance, double bonusPoints) {
        super(id, balance);
        this.bonusPoints = bonusPoints;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    @Override
    public boolean buyWithSalaryCard(int cash) {
        boolean result;
        if (this.getBalance() < cash) {
            result = false;
        } else {
            result = true;
            this.withdrawСash(cash);
            bonusPoints += (double) cash * 0.05;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HalvaPlus halvaPlus = (HalvaPlus) o;
        return Double.compare(halvaPlus.bonusPoints, bonusPoints) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonusPoints);
    }

    @Override
    public String toString() {
        return "HalvaPlus{" +
                "bonusPoints=" + bonusPoints +
                '}';
    }
}
