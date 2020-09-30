package BTU.constructor1;

public class ClassD {
    int x = 0, y = 10;

    public ClassD() {
        System.out.println("Hello My Class");
    }

    public int firstMethod() {
        return x > 0 ? ((4 * x) - y) : ((2 * x) + y);
    }

    public int secondMethod() {
        return y > 0 ? ((4 * x) + y) : ((2 * x) - y);
    }
}
