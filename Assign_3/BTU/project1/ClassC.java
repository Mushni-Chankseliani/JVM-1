package BTU.project1;

public class ClassC {
    public int a, b, c;

    public void getNums(int var1, int var2, int var3) {
        a = var1;
        b = var2;
        c = var3;
    }

    public int getFirstIntLastDigit() {
        return a % 10;
    }

    public int getSecondIntFirstDigit() {
        return Integer.parseInt(Integer.toString(b).substring(0, 1));
    }

    public int getThirdIntDigitsSum() {
        int cloneC = c;
        int sum = 0;
        while (cloneC > 0) {
            sum = sum + cloneC % 10;
            cloneC = cloneC / 10;
        }

        return sum;
    }

    public int printFirstAndSecondMethodsMultiply() {
        return getFirstIntLastDigit() * getSecondIntFirstDigit();
    }

    public void printMethodsSum() {
        System.out.println(getThirdIntDigitsSum() + printFirstAndSecondMethodsMultiply());
    }
}
