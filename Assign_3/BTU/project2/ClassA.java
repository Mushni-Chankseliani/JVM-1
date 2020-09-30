package BTU.project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassA {
    public int[] m = new int[10];

    public void fillArrayFromConsole() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("Array" + Arrays.toString(m));
    }

    public void fillArrayWithRandomNums() {
        for (int i = 0; i < m.length; i++) {
            m[i] = new Random().nextInt(15 + 1);
        }
        System.out.println("Random Array" + Arrays.toString(m));
    }

    public void printMoreThanSeven() {
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 7) {
                System.out.printf("index: %d, value: %d \n", i, m[i]);
            }
        }
    }

    public int findMinMax() {
        int minValue = m[0];
        int maxValue = m[0];
        for(int i=1; i<m.length; i++){
            if(m[i] < minValue){
                minValue = m[i];
            }
            if(m[i] > maxValue){
                maxValue = m[i];
            }
        }

        System.out.printf("min: %d, max: %d \n", minValue, maxValue);
        return maxValue - minValue;
    }
}
