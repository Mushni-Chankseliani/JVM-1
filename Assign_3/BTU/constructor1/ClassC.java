package BTU.constructor1;

public class ClassC {
    int a, b, x = 15;

    public ClassC() {
    }

    public ClassC(int valueA, int valueB) {
        this.a = valueA;
        this.b = valueB;
    }

    public boolean isRange() {
        return a < b;
    }

    public boolean rangeIncludesValue() {
        return isRange() && x > a && x < b;
    }
}
