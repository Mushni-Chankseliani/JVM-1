package Homework7.Classes;

import java.util.Scanner;

public class InputFiveNumbers {
    public void inputNums() {
        Scanner sc = new Scanner(System.in);
        Obj[] myObj = new Obj[5];
        int[] array = new int[5];

        int diffNums = 0;
        for (int i = 0; i < myObj.length; i++) {
            int val = sc.nextInt();
            array[i] = val;
            diffNums = this.updateOrCreate(myObj, val, diffNums);
        }

        this.printResult(myObj, diffNums, array);
    }

    private void printResult(Obj[] myObj, int diffNums, int[] array) {
        for (int i = 0; i < diffNums; i++) {
            if (myObj[i].value > 2) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != myObj[i].key) {
                        System.out.println("index: " +  j);
                    }
                }
                return;
            }
        }

        System.out.println("NO");
    }

    private int updateOrCreate(Obj[] myObj, int key, int diffNums) {
        for (int i = 0; i < diffNums; i++) {
            if (myObj[i].key == key) {
                myObj[i].value++;
                return diffNums;
            }
        }

        myObj[diffNums++] = new Obj(key, 1);
        return diffNums;
    }
}

class Obj {
    public int key;
    public int value;

    public Obj(int k, int v) {
        this.key = k;
        this.value = v;
    }
}
