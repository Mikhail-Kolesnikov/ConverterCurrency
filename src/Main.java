
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

            if ("HISTORY".equals(currencyIn)) { // Проверьте, верен ли ввод пользователя "HISTORY"
                // Получить историю обмена и отобразить ее
                System.out.println("\nCurrency Exchange History:");
                for (CurrencyExchangeHistory.Exchange exchange : exchangeHistory.getHistory()) {
                    System.out.println(STR."From: \{exchange.getFromCurrency()} To: \{exchange.getToCurrency()} Amount: \{exchange.getAmount()} Date: \{exchange.getDate()}");
                }
                continue; // Пропустите оставшуюся часть цикла и начните заново
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