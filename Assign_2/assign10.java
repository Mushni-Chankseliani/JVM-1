import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        double[] myNums = { 10, 15, 11.2, -12, 14, 13, 9, -1, 2 };
        Arrays.sort(myNums);
        System.out.printf("%s", Arrays.toString(myNums));
    }
}