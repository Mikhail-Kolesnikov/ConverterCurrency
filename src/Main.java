import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        CurrencyExchangeHistory currencyExchangeHistory = new CurrencyExchangeHistory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать");
        System.out.println("Введите валюту, в которую хотите конвертировать: USD, EURO, JPY ");
        String currencyIn = scanner.nextLine().toUpperCase();
        System.out.println("Введите валюту, которую хотите конвертировать: USD, EURO, JPY ");
        String currencyOut = scanner.nextLine().toUpperCase();
        System.out.println("Введите жалаемую сумму ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String res = calculatedCurrency.typeCurrency(amount, currencyIn, currencyOut);
        currencyExchangeHistory.addExchange(currencyIn, currencyOut, amount, new Date());

        System.out.println(res);
    }

    public static class CalculatedCurrency {
        public String typeCurrency(double amount, String currencyIn, String currencyOut) {
            double rate = getRate(currencyIn, currencyOut);
            double convertedAmount = amount * rate;
            return "The converted amount is: " + convertedAmount;
        }

        private double getRate(String currencyIn, String currencyOut) {
            if (currencyIn.equals("USD") && currencyOut.equals("EURO")) {
                return 0.85;
            } else if (currencyIn.equals("EURO") && currencyOut.equals("USD")) {
                return 1.18;
            }
            return 0;
        }
    }

    public static class CurrencyExchangeHistory {
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
}

