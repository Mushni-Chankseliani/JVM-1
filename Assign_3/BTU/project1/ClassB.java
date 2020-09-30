package BTU.project1;

public class ClassB {
    public int a, b, c;

    public void getNums(int var1, int var2, int var3) {
        a = var1;
        b = var2;
        c = var3;
    }

    public void printMax() {
        int max = a > b && a > c ? a : (b > a && b > c ? b : c);
        System.out.print(max);
    }

    public int printMin() {
        int min = a < b && a < c ? a : (b < a && b < c ? b : c);
        return min;
    }

}
