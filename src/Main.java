import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatedCurrency calculatedCurrency = new CalculatedCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать");
        System.out.println("Выберите валюту: ");
        System.out.println("1 - UER, 2 - USD, 3 -  JPY ");
        int count = scanner.nextInt();
        System.out.println("Введите жалаемую сумму ");
        double amount = scanner.nextDouble();

        double res =calculatedCurrency.typeCurrency(amount, "Rub", count);

        System.out.println(res);


    }


}

