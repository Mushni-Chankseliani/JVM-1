class Main {
    public static void main(String[] args) {
        int firstNum = 25, secondNum = 20, gcd = 1;

        for(int i = 1; i <= firstNum && i <= secondNum ; i++) {
            if(firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
            }
        }

        int lcm = (firstNum * secondNum) / gcd;

        System.out.printf("GCD of %d and %d is: %d\n", firstNum, secondNum, gcd);
        System.out.printf("LCM of %d and %d is: %d", firstNum, secondNum, lcm);
    }
}