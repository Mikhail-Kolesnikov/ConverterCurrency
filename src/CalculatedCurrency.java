import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CalculatedCurrency implements CalculateOfCurrency {

    public Currency converter;
    //отношение валют
    private static final double USD_TO_EUR = 1.03;
    private static final double JPY_TO_EUR = 7.01;

    private static final double EUR_TO_USD = 0.98;
    private static final double JPY_TO_USD = 7.16;

    private static final double USD_TO_JPY = 0.11;
    private static final double EUR_TO_JPY = 0.12;

    private List<String> historyExchange = new ArrayList<>();


    @Override
    public String typeCurrency(double amount, String currencyIn, String currencyOut) {
        double result = 0.0;

        String exchange = "Amount " + amount + "  " + currencyOut + " to " + currencyIn;


        switch (currencyIn + currencyOut) {//выбор валюты и конвертация
            case "JPYUSD"://Dollar
                result = amount * JPY_TO_USD;
                System.out.println(amount + " Dollars = " + result + " JPY ");
                break;
            case "EUROUSD":
                result = amount * EUR_TO_USD;
                System.out.println(amount + " Dollars = " + result + " EUR ");
                break;
            case "JPYEURO"://EURO
                result = amount * JPY_TO_EUR;
                System.out.println(amount + " EURO = " + result + " JPY");
                break;
            case "USDEURO":
                result = amount * USD_TO_EUR;
                System.out.println(amount + " EURO = " + result + " USD ");
                break;
            case "EUROJPY"://JPY
                result = amount * EUR_TO_JPY;
                System.out.println(amount + " JPY = " + result + " EURO ");
                break;
            case "USDJPY":
                result = amount * USD_TO_JPY;
                System.out.println(amount + " JPY = " + result + " USD ");
                break;

            default:
                System.out.println("Ошибка");
                return ("Конвертация " + currencyIn + currencyOut);


        }
        exchange += " " + result;
        exchange += " " + LocalDateTime.now();
        historyExchange.add(exchange);
        return exchange;

    }

    public void printHistoryExchange() {
        System.out.println("История запроса обмена валют");
        for (String string : historyExchange) {
            System.out.println(string);

        }
    }


}







