package BTU.project1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassA myClassA = new ClassA();
        myClassA.getNums(sc.nextInt(), sc.nextInt());
        myClassA.intSum();
        System.out.println(myClassA.intMultiply());

        ClassB myClassB = new ClassB();
        myClassB.getNums(sc.nextInt(), sc.nextInt(), sc.nextInt());
        myClassB.printMax();
        System.out.println();
        System.out.println(myClassB.printMin());

        ClassC myClassC = new ClassC();
        myClassC.getNums(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(myClassC.getFirstIntLastDigit());
        System.out.println(myClassC.getSecondIntFirstDigit());
        System.out.println(myClassC.getThirdIntDigitsSum());
        System.out.println(myClassC.printFirstAndSecondMethodsMultiply());
        myClassC.printMethodsSum();
    }
}
