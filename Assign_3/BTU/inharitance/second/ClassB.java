package BTU.inharitance.second;

public class ClassB extends ClassA {

    public ClassB() {

    }

    public ClassB(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public int valueDiff() {
        return y - x;
    }

    public int valueMultiply() {
        return x + (2 * y);
    }

}

