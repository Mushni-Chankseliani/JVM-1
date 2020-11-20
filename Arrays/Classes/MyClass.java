package Arrays.Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyClass {

    // global
    private ArrayList getArrayWithRandomNumbers() {
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt());
        }

        return arrayList;
    }
    //    ჩაწერეთ კოლექციაშიში ხუთი შემთხვევითი მთელი რიცხვი და დაბეჭდეთ.
    public void firstMethod() {
        ArrayList myArray = this.getArrayWithRandomNumbers();

        System.out.println(myArray);
    }
//    ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაბეჭდეთ პირდაპირი
//    და შებრუნებული რიგით.
    public void secondMethod() {
        ArrayList myArray = this.getArrayWithRandomNumbers();
        System.out.println("base: " + myArray);
        Collections.reverse(myArray);
        System.out.println("reversed: " + myArray);
    }

//    ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ ზრდადო-
//    ბით და დაბეჭდეთ.
    public void thirdMethod() {
        ArrayList myArray = this.getArrayWithRandomNumbers();
        Collections.sort(myArray);
        System.out.println("sorted: " + myArray);
    }

//    ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ კლებადო-
//    ბით და დაბეჭდეთ.
    public void fourthMethod() {
        ArrayList myArray = this.getArrayWithRandomNumbers();
        Collections.sort(myArray, Collections.reverseOrder());

        System.out.println("Reverse sorted: " + myArray);
    }

}
