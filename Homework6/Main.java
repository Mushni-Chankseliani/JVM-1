package Homework6;

import Homework6.classes.Currency;

public class Main {
    public static void main(String[] args) {
        Currency currencyClass = new Currency();

        currencyClass.changeCurrency();
        currencyClass.initValues();

        currencyClass.calculateValue();
    }

}
