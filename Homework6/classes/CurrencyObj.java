package Homework6.classes;

public class CurrencyObj {
    public String currencyName;
    public double currencyValue;
    public int currencyId;

    public CurrencyObj(int id, String name, double value) {
        this.currencyId = id;
        this.currencyName = name;
        this.currencyValue = value;
    }
}
