import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать");
        System.out.println("Введите валюту, в которую хотите конвертировать: USD, EURO, JPY ");
        String currencyIn = scanner.nextLine().toUpperCase();
        System.out.println("Введите валюту, которую хотите конвертировать: USD, EURO, JPY ");
        String currencyOut = scanner.nextLine().toUpperCase();
        System.out.println("Введите жалаемую сумму ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Exchange exchange = new Exchange(currencyIn, currencyOut, amount, new Date());
        String res = calculatedCurrency.typeCurrency(exchange);

        System.out.println(res);


    }

}

public class CalculatedCurrency {

    public String typeCurrency(Exchange exchange) {

        return null;
    }
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
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
