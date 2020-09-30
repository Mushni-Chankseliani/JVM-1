package BTU.constructor1;

public class ClassE {
    public float x, y = 12;

    public ClassE() {
    }

    public ClassE(float valueX) {
        this.x = valueX;
    }

//    piroba iyo gaugebrad
    public boolean firstMethod() {
        return x == 0;
    }

    public float isMinimum() {
        return x > y ? x : y;
    }
}
