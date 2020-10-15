package Homework5.project1;

public class ClassA {
    int a = 10, b = 29;

    public void printString() {
        System.out.println("Hello OOP");
    }

    public void printA() {
        System.out.println(a);
    }

    public void printB() {
        System.out.println(b);
    }

    public void printSum() {
        System.out.println(a + b);
    }

    public int getSum() {
        return a + b;
    }
    public int getMultiply() {
        return a * b;
    }

    public void initVars() {
        this.a = 5;
        this.b = 6;
    }
}
