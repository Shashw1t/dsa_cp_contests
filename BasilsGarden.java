import java.util.Scanner;

public class BasilsGarden {
    public static long findMaximumValue(long totalNumberOfElements) {
        Scanner sc = new Scanner(System.in);
        long maximum = 0;
        long finallyValue = 0;
        for (long i = 0; i < totalNumberOfElements; ++i) {
            long currentValue = sc.nextLong();
            finallyValue = Math.max(finallyValue, currentValue + i);
        }
        return finallyValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numTestCases = sc.nextLong();
        while (numTestCases-- > 0) {
            long totalNumberOfElements = sc.nextLong();
            long maximumValue = findMaximumValue(totalNumberOfElements);
            System.out.println(maximumValue);
        
        sc.close();
    }
}
