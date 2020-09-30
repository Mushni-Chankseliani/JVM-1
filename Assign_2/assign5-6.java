import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int number = sc.nextInt();
        int numberSum = 0;

        while (number > 0) {
            numberSum += number % 10;
            number /= 10;
        }

        System.out.println(numberSum);

        sc.close();
    }
}