package Homework7.Classes;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int cloneValue = value;
        int result = 0;
        while (cloneValue > 0) {
            int num = cloneValue % 10;
            result = (result * 10) + num;
            cloneValue /= 10;
        }

        return value == result;
    }
}
