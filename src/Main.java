
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        CurrencyExchangeHistory exchangeHistory = new CurrencyExchangeHistory();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добро пожаловать");
            System.out.println("Введите валюту, в которую хотите конвертировать: USD, EURO, JPY ");
            String currencyIn = scanner.nextLine().toUpperCase();

            if ("HISTORY".equals(currencyIn)) { // Check if user input is "HISTORY"
                // Retrieve the exchange history and display it
                System.out.println("\nCurrency Exchange History:");
                for (CurrencyExchangeHistory.Exchange exchange : exchangeHistory.getHistory()) {
                    System.out.println("From: " + exchange.getFromCurrency() +
                            " To: " + exchange.getToCurrency() +
                            " Amount: " + exchange.getAmount() +
                            " Date: " + exchange.getDate());
                }
                continue; // Skip the rest of the loop and start over
            }

            System.out.println("Введите валюту, которую хотите конвертировать: USD, EURO, JPY ");
            String currencyOut = scanner.nextLine().toUpperCase();

            System.out.println("Введите желаемую сумму ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Использовать символ новой строки

            String res = calculatedCurrency.typeCurrency(amount, currencyIn, currencyOut);
            System.out.println(res);

            // Пример использования: добавьте запись обмена (вы можете настроить эту часть)
            exchangeHistory.addExchange(currencyIn, currencyOut, amount, new Date());
        }
    }
}