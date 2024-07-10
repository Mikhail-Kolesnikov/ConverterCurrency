public class CalculatedCurrency implements CalculateOfCurrency {

    public Currency converter;
    //отношение рубля к валюте
    private static final double RUB_TO_EUR = 100.5;
    private static final double RUB_TO_USD = 93.6;
    private static final double RUB_TO_JPY = 14.6;


    @Override
    public double typeCurrency(double amount, String currencyIn, int count) {
        double result = 0.0;


        switch (count) {//выбор валюты и конвертация в рубли
            case 1:
                result = amount * RUB_TO_EUR;
                System.out.println(result + "Rub");
                break;
            case 2:
                result = amount * RUB_TO_USD;
                System.out.println(result + " Rub");
                break;
            case 3:
                result = amount * RUB_TO_JPY;
                System.out.println(result + " Rub");
                break;

            default:
                System.out.println("Ошибка");
                break;

        }

        return count;
    }
}
