package Homework5.project1;

import java.util.Scanner;

public class ClassC {
    int a = 10, b = 9;
    char s = '#', h = '@';

    public void printInts() {
        System.out.println(a + " " + b);
    }

    public void printChars() {
        System.out.println(s + " " + h);
    }

    public void printIntActions() {
        System.out.println("sum: " + (a + b));
        System.out.println("multiply: " + (a * b));
        System.out.println("diff: " + (a - b));
        System.out.println("rem: " + (a % b));
    }

    public void initA() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    public void initB() {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
    }

    public void initChars() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().charAt(0);
        h = sc.nextLine().charAt(0);
    }
}
