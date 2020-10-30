package Homework7;

import Homework7.Classes.InputFiveNumbers;
import Homework7.Classes.Palindrome;
import Homework7.Classes.RandomNumsArray;
import Homework7.Classes.ReverseRowMultiply;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome());

        RandomNumsArray randomNumsArray = new RandomNumsArray();
        System.out.println(randomNumsArray.countMoreThanIndex());

        ReverseRowMultiply reverseRowMultiply = new ReverseRowMultiply();
        reverseRowMultiply.printMultiplyResult();

        InputFiveNumbers inputFiveNumbers = new InputFiveNumbers();
        inputFiveNumbers.inputNums();
    }
}
