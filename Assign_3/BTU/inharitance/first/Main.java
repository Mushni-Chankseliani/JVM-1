package BTU.inharitance.first;

public class Main {
    public static void main(String[] args) {
        ClassA myClassA = new ClassA();
        myClassA.initializeValue();
        myClassA.printValue();
        System.out.println(myClassA.isEvenOrAdd());
        ClassB myClassB = new ClassB();
        myClassB.initY();
        System.out.println(myClassB.sumOfValues());
    }
}
