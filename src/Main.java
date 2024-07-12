import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        CurrencyExchangeHistory currencyExchangeHistory = new CurrencyExchangeHistory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добро пожаловать");
            System.out.println("Введите валюту, в которую хотите конвертировать: (USD, EURO, JPY) или введите History " +
                    "для просмотра операций по обмену валют ");
            String currencyIn = scanner.nextLine().toUpperCase();

            if (currencyIn.startsWith("HISTORY")) {
                calculatedCurrency.printHistoryExchange();

            }

            System.out.println("Введите валюту, которую хотите конвертировать: USD, EURO, JPY ");
            String currencyOut = scanner.nextLine().toUpperCase();
            System.out.println("Введите жалаемую сумму ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            String res = calculatedCurrency.typeCurrency(amount, currencyIn, currencyOut);
            currencyExchangeHistory.addExchange(currencyIn, currencyOut, amount, new Date());

            System.out.println(res);
        }
    }
}
