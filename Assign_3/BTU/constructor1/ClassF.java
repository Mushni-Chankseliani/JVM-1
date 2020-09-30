package BTU.constructor1;

public class ClassF {
    public float x, y;

    public ClassF() {};

    public ClassF(float valueX) {
        this.x = valueX;
    }

    public ClassF(float valueX, float valueY) {
        this.x = valueX;
        this.y = valueY;
    }

    public float gcd() {
        float result = 0;
        for(int i = 1; i <= x && i <= y ; i++) {
            if(x % i == 0 && y % i == 0) {
                result = i;
            }
        }

        return result;
    }

    public float lcm() {
        return (x * y) / gcd();
    }
}
