class Main {
    public static void main(String[] args) {
        double[] myNums = { 10.2, 11.0, 25.3, 16.2, 5, 1, 2, 9 };
        for(double item : myNums) {
            System.out.println(item);
        }
        System.out.println("max value is: " + getMax(myNums));
        System.out.println("min value is: " + getMin(myNums));
    }

    public static double getMax(double[] inputArray){
        double maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static double getMin(double[] inputArray){
        double minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
