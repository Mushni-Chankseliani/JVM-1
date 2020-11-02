package Classwork8.Assign1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.initValues();
        System.out.println("Elements less than index sum: " + myClass.elementsLessThanIndexSum());


        System.out.println("Indexes less than value multiply: " + myClass.indexesLessThanValueSum());

        System.out.println("Even numbers: ");
        myClass.printEvenNumbers();
    }
}
