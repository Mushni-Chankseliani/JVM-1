package BTU.inharitance.second;

public class Main {
    public static void main(String[] args) {
        ClassC myClassC = new ClassC();
        myClassC.initValues();
        System.out.println(myClassC.firstMethod());
        System.out.println(myClassC.secondMethod());
        System.out.println(myClassC.maxValue());
    }
}
