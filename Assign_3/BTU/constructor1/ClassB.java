package BTU.constructor1;

public class ClassB {
    int x;

    public ClassB() {
    }

    public ClassB(int y) {
        this.x = y;
    }

    public void rangeOfVar() {
        System.out.println(x > 5 && x < 24);
    }
}
