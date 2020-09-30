import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int firstNum = sc.nextInt();

        System.out.println("Enter Second Number");
        int secondNum = sc.nextInt();


        System.out.println("first case: " + (firstNum / secondNum));
        System.out.println("second case: " + (secondNum % firstNum));

        sc.close();
    }
}