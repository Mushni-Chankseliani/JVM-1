package BTU.inharitance.first;

import java.util.Scanner;

public class ClassA {
    public static int x;

    public ClassA() {
        System.out.println("Hello My A Class");
    }

    public int getValue() {
        return x;
    }

    public void initializeValue() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }

    public void printValue() {
        System.out.println(x);
    }

    public String isEvenOrAdd() {
        return x % 2 == 0 ? "even" : "odd";
    }
}
