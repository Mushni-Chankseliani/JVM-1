package Homework7.Classes;

import java.util.Random;

public class RandomNumsArray {
    public int[] randomArray = new int[100];

    public int countMoreThanIndex() {
        Random rd = new Random();
        int counter = 0;
        for(int i = 0; i < this.randomArray.length; i++) {
            randomArray[i] = rd.nextInt();
            if (randomArray[i] > i) {
                counter++;
            }
        }

        return counter;
    }
}
