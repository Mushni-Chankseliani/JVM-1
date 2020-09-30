package BTU.inharitance.first;

import java.util.Scanner;

public class ClassB extends ClassA {
    public int y;

    public void initY() {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
    }

    public int sumOfValues() {
        return x + y;
    }
}
