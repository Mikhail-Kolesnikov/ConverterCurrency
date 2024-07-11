import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyExchangeHistory {
    private ArrayList<Exchange> history;

    public CurrencyExchangeHistory() {
        this.history = new ArrayList<>();
    }

    public void addExchange(String fromCurrency, String toCurrency, double amount, Date date) {
        this.history.add(new Exchange(fromCurrency, toCurrency, amount, date));
    }

    public List<Exchange> getHistory() {
        return this.history;
    }

    class Exchange {
        private String fromCurrency;
        private String toCurrency;
        private double amount;
        private Date date;

        public Exchange(String fromCurrency, String toCurrency, double amount, Date date) {
            this.fromCurrency = fromCurrency;
            this.toCurrency = toCurrency;
            this.amount = amount;
            this.date = date;
        }

        public String getFromCurrency() {
            return this.fromCurrency;
        }

        public String getToCurrency() {
            return this.toCurrency;
        }

        public double getAmount() {
            return this.amount;
        }

        public Date getDate() {
            return this.date;
        }
    }
}