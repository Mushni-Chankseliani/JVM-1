package Homework5.project1;

public class Main {
    public static void main(String[] args) {
        ClassA myClassA = new ClassA();
        myClassA.printString();
        myClassA.printA();
        myClassA.printB();
        myClassA.printSum();
        System.out.println(myClassA.getSum());
        System.out.println(myClassA.getMultiply());
        myClassA.initVars();
        myClassA.printA();
        myClassA.printB();

        ClassB myClassB = new ClassB();
        myClassB.printA();
        myClassB.printB();
        myClassB.printS();
        myClassB.printDiff();
        System.out.println(myClassB.getDivide());
        myClassB.initVars();
        myClassB.printA();
        myClassB.initA();
        myClassB.printMoreThanB();
        myClassB.printA();
        myClassB.printB();
        myClassB.printS();

        ClassC myClassC = new ClassC();
        myClassC.printInts();
        myClassC.printChars();
        myClassC.printIntActions();
        myClassC.initA();
        myClassC.initB();
        myClassC.initChars();
        myClassC.printInts();
        myClassC.printChars();
        myClassC.printIntActions();
    }
}
