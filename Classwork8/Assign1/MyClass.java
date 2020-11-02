package Classwork8.Assign1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyClass {
    public int[] m = new int[15];

    public void initValues() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            for (int i = 0; i < this.m.length; i++) {
                this.m[i] = ThreadLocalRandom.current().nextInt(b, a + 1);
            }
        } else {
            for (int i = 0; i < this.m.length; i++) {
                this.m[i] = ThreadLocalRandom.current().nextInt(a, b + 1);
            }
        }

    }

    public int elementsLessThanIndexSum() {
        int result = 0;
        for (int i = 0; i < this.m.length; i++) {
            if (m[i] < i) {
                result += m[i];
            }
        }

        return result;
    }

    public int indexesLessThanValueSum() {
        int result = 1;
        for (int i = 0; i < this.m.length; i++) {
            if (m[i] > i) {
                result *= i;
            }
        }
        // what about zero index?
        return result;
    }

    public void printEvenNumbers() {
        for (int j : this.m) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
