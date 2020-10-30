package Homework7.Classes;

import java.util.Scanner;

public class ReverseRowMultiply {
    public void printMultiplyResult() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int reverseValue = 0;
        while (value > 0) {
            int num = value % 10;
            reverseValue = (reverseValue * 10) + num;
            value /= 10;
        }

        System.out.println(reverseValue * 2);
    }
}
