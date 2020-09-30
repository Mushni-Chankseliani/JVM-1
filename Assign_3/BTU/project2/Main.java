package BTU.project2;

public class Main {

    public static void main(String[] args) {
        ClassA myClassA = new ClassA();
        myClassA.fillArrayWithRandomNums();
        myClassA.printMoreThanSeven();
        System.out.println(myClassA.findMinMax());
    }
}