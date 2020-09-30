package BTU.inharitance.second;

import java.util.Scanner;

public class ClassA {
    public static int x, y;

    public ClassA() {}

    public void initValues() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void printX() {
        System.out.println(x);
    }

    public void printY() {
        System.out.println(y);
    }
}
