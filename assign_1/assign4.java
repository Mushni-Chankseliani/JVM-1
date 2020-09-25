import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int intNum = sc.nextInt();
        while (intNum > 0) {
            System.out.println( intNum % 10);
            intNum /= 10;
        }

        sc.close();
    }
}