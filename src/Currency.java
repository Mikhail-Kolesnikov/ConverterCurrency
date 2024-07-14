import java.util.Objects;

public class Currency {

//    private static final double RUB_TO_EUR = 100.5;
//    private static final double RUB_TO_USD = 93.6;
//    private static final double RUB_TO_JPY = 14.6;

    private double JPY;
    private double Dollar;
    private double Euro;
    private double amount;

    public Currency(double euro, double amount, double dollar, double JPY) {
        Euro = euro;
        this.amount = amount;
        Dollar = dollar;
        this.JPY = JPY;
    }


    @Override
    public String toString() {
        return "currency{" +
                "JPY=" + JPY +
                ", Dollar=" + Dollar +
                ", Euro=" + Euro +
                ", amount=" + amount +
                '}';
    }

    public double getJPY() {
        return JPY;
    }

    public double getDollar() {
        return Dollar;
    }

    public void setDollar(double dollar) {
        Dollar = dollar;
    }

    public double getEuro() {
        return Euro;
    }

    public void setEuro(double euro) {
        Euro = euro;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Double.compare(JPY, currency.JPY) == 0 && Double.compare(Dollar, currency.Dollar) == 0 && Double.compare(Euro, currency.Euro) == 0 && Double.compare(amount, currency.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(JPY, Dollar, Euro, amount);
    }
}

//public class OperationWithDebiting {
//
//    public double amount;
//
//    public Debiting type;
//    public int years;
//
//    private static final double BASE_DEBIT_RATE = 1.0;
//
//    public OperationWithDebiting(Debiting type,int amount) {
//        this.amount = amount;
//        this.type = type;
//
//    }
//
//    public double calculateDebit() {
//        if (type == Debiting.PROFITABLE_DEBIT) {
//            return 1.065;
//        }
//        if (type == Debiting.SAVINGS_DEBIT) {
//            return 2.068;
//        }
//        if (type == Debiting.DEBIT_FOR_EVERYONE) {
//            return 1.071;
//        }
//        return BASE_DEBIT_RATE;

//public double calculate(OperationWithDebiting operationWithDebiting, int years){
//        double debit = operationWithDebiting.calculateDebit();
//        double amount = operationWithDebiting.getAmount();
//        for (int i = 0; i < years; i++) {
//
//            amount *= debit;
//
//        }
//        return amount;
//    }

//       if (type == Debiting.PROFITABLE_DEBIT) {
//            return 1.065;
//        }
//        if (type == Debiting.SAVINGS_DEBIT) {
//            return 2.068;
//        }
//        if (type == Debiting.DEBIT_FOR_EVERYONE) {
//            return 1.071;
//        }
//        return BASE_DEBIT_RATE;
