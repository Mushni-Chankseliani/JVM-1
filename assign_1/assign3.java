import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = sc.nextInt();


        System.out.println("Enter second number");
        int secondNum = sc.nextInt();

        System.out.println("Enter third number");
        int thirdNum = sc.nextInt();


        System.out.println("sum is: " + (firstNum + secondNum + thirdNum));
        System.out.println("miltiplied is: " + (firstNum * secondNum * thirdNum));

        sc.close();
    }
}