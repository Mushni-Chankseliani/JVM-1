package BTU.constructor1;

public class Main {
    public static void main(String[] args) {
        ClassA myClassA = new ClassA();
        myClassA.isEven();

        ClassB myClassB = new ClassB(45);
        myClassB.rangeOfVar();

        ClassC myClassC = new ClassC(12, 23);
        System.out.println(myClassC.rangeIncludesValue());

        ClassD myClassD = new ClassD();
        System.out.println(myClassD.firstMethod());
        System.out.println(myClassD.secondMethod());

        ClassE myClassE = new ClassE(10);
        System.out.println(myClassE.firstMethod());
        System.out.println(myClassE.isMinimum());

        ClassF myClassF = new ClassF(24, 12);
        System.out.println(myClassF.gcd());
        System.out.println(myClassF.lcm());
    }
}
