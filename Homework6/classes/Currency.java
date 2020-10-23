package Homework6.classes;

import java.util.Scanner;

public class Currency implements Homework6.interfaces.Currency {
    public int valueFrom, valueTo, changeableValue;
    public double convertibleValue, changeableValueAmount;

    CurrencyObj[] currencyObjs = new CurrencyObj[4];

    public Currency() {
        currencyObjs[0] = new CurrencyObj(1, "gel", 1);
        currencyObjs[1] = new CurrencyObj(2, "usd", 1.7710);
        currencyObjs[2] = new CurrencyObj(3, "eur", 2.2700);
        currencyObjs[3] = new CurrencyObj(4, "gbp", 2.8950);
    }

    public void changeCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("to change currency, choose it by its id: 1 - GEL, 2 - USD, 3 - EUR, 4 - GBP \nenter 0  to close program");
        while(true) {
            System.out.println("enter id:");
            changeableValue = sc.nextInt();
            if (changeableValue == 0) {
                break;
            }
            if (changeableValue < 1 || changeableValue > 4) {
                System.out.println("this id doesn't exist");
            } else {
                System.out.println("enter new price:");
                changeableValueAmount = sc.nextDouble();

                for (int i = 0; i < this.currencyObjs.length; i++) {

                    if (this.currencyObjs[i].currencyId == changeableValue) {
                        this.currencyObjs[i].currencyValue = changeableValueAmount;
                        System.out.println("value has changed, new value of " + this.currencyObjs[i].currencyName + " is: " + this.currencyObjs[i].currencyValue);
                    }
                }
            }
        }

    }

    public void initValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose currency by its id: 1 - GEL, 2 - USD, 3 - EUR, 4 - GBP");

        while(this.valueFrom < 1 || this.valueFrom > 4) {
            System.out.println("choose first value: ");
            this.valueFrom = sc.nextInt();
        }

        while(this.valueTo < 1 || this.valueTo > 4) {
            System.out.println("choose second value: ");
            this.valueTo = sc.nextInt();
        }

        System.out.println("Enter amount: ");
        this.convertibleValue = sc.nextInt();
    }

    public void calculateValue() {
        double valueFromRate = 0;
        double valueToRate = 0;

        for (CurrencyObj currencyObj : this.currencyObjs) {

            if (currencyObj.currencyId == this.valueFrom) {
                valueFromRate = currencyObj.currencyValue;
            }
            if (currencyObj.currencyId == this.valueTo) {
                valueToRate = currencyObj.currencyValue;

            }
        }

        System.out.println(this.convertibleValue * (valueFromRate / valueToRate));
    }

}
