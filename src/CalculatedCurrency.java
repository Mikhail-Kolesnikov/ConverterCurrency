public class CalculatedCurrency implements CalculateOfCurrency {

    public Currency converter;
    //отношение валют
    private static final double USD_TO_EUR = 1.03;
    private static final double JPY_TO_EUR = 7.01;

    private static final double EUR_TO_USD = 0.98;
    private static final double JPY_TO_USD = 7.16;

    private static final double USD_TO_JPY = 0.11;
    private static final double EUR_TO_JPY = 0.12;


    @Override
    public double typeCurrency(double amount, String currencyIn, int count) {
        double result = 0.0;


        switch (count) {//выбор валюты и конвертация
            case 1://Dollar
                result = amount * JPY_TO_USD;
                System.out.println(amount + " Dollars = " + result + " JPY ");
                result = amount * EUR_TO_USD;
                System.out.println(amount + " Dollars = " + result + " EUR ");
                break;
            case 2://EURO
                result = amount * JPY_TO_EUR;
                System.out.println(amount + " EURO = " + result + " JPY");
                result = amount * USD_TO_EUR;
                System.out.println(amount + " EURO = " + result + " USD ");
                break;
            case 3://JPY
                result = amount * EUR_TO_JPY;
                System.out.println(amount + " JPY = " + result + " EURO ");
                result = amount * USD_TO_JPY;
                System.out.println(amount + " JPY = " + result + " USD ");

            default:
                System.out.println("Ошибка");
                break;

        }

        return count;
    }
}
