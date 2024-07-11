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

        String res = calculatedCurrency.typeCurrency(amount, currencyIn, currencyOut);

        System.out.println(res);


    }

}

