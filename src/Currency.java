import java.util.Objects;

public class Currency implements CalculateCurrency {


    private double dollar;
     private double euro;
     private double uaDollar;
     private double amount;

    public Currency(double dollar, double euro, double uaDollar, double amount) {
        this.dollar = dollar;
        this.euro = euro;
        this.uaDollar = uaDollar;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "dollar=" + dollar +
                ", euro=" + euro +
                ", uaDollar=" + uaDollar +
                ", amount=" + amount +
                '}';
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getUaDollar() {
        return uaDollar;
    }

    public void setUaDollar(double uaDollar) {
        this.uaDollar = uaDollar;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Double.compare(dollar, currency.dollar) == 0 && Double.compare(euro, currency.euro) == 0 && Double.compare(uaDollar, currency.uaDollar) == 0 && Double.compare(amount, currency.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dollar, euro, uaDollar, amount);
    }
}
