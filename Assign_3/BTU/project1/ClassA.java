package BTU.project1;

public class ClassA {
    public int x, y;

    public void getNums (int var1, int var2) {
        x = var1;
        y = var2;
    }

    public void intSum() {
        System.out.println(x + y);
    }

    public int intMultiply() {
        return x * y;
    }
}
