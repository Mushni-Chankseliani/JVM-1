package BTU.inharitance.second;

public class ClassC extends ClassB {
    public static double z = 10;

    public double firstMethod() {
        return (x + y + z) / 3;
    }

    public double secondMethod() {
        return (x * y * z) / 3;
    }

    public double maxValue() {
        return x > y && x > z ? y : (y > x && y > z ? y : z);
    }

}
