package Homework5.project1;

import java.util.Scanner;

public class ClassB {
    int a = 33;
    double b = 9.7;
    char s = '#';

    public void printS() {
        System.out.println(s);
    }

    public void printA() {
        System.out.println(a);
    }

    public void printB() {
        System.out.println(b);
    }

    public void printDiff() {
        System.out.println(a - b);
    }

    public double getDivide() {
        return (a / b);
    }

    public void initVars() {
        a = 10;
        b = 5.5;
        s = '$';
    }

    public void initA() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    public void printMoreThanB() {
        System.out.println(b + 10);
    }
}
