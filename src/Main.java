import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать");
        System.out.println("Выберите валюту: ");
        System.out.println("1 - USD (In JPY and EURO), 2 - EURO (In USD and JPY), 3 - JPY (In EURO and USD)");
        int count = scanner.nextInt();
        System.out.println("Введите жалаемую сумму ");
        double amount = scanner.nextDouble();

        double res = calculatedCurrency.typeCurrency(amount, "Rub", count);

        System.out.println(res);


    }


}

