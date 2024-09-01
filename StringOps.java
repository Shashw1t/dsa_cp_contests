import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StringOps {
    private static int calculateOpsForEvenLength(int totalLength, String str) {
        Map<Character, Integer> evenCharCounts = new HashMap<>();
        Map<Character, Integer> oddCharCounts = new HashMap<>();

        for (int index = 0; index < totalLength; index++) {
            if (index % 2 == 0) {
                evenCharCounts.put(str.charAt(index), evenCharCounts.getOrDefault(str.charAt(index), 0) + 1);
            } else {
                oddCharCounts.put(str.charAt(index), oddCharCounts.getOrDefault(str.charAt(index), 0) + 1);
            }
        }

        int maxEvenCount = 0;
        int maxOddCount = 0;
        for (int count : evenCharCounts.values()) {
            maxEvenCount = Math.max(maxEvenCount, count);
        }

        for (int count : oddCharCounts.values()) {
            maxOddCount = Math.max(maxOddCount, count);
        }

        return (totalLength / 2 - maxEvenCount) + (totalLength / 2 - maxOddCount);
    }
    private static int calculateOpsForOddLength(int totalLength, String str) {
        if (totalLength == 1) {
            return 1;
        }

        int minOperations = Integer.MAX_VALUE;
        Map<Character, Integer> evenCounts = new HashMap<>();
        Map<Character, Integer> oddCounts = new HashMap<>();

        for (int index = 0; index < totalLength - 1; index++) {
            if (index % 2 == 0) {
                evenCounts.put(str.charAt(index), evenCounts.getOrDefault(str.charAt(index), 0) + 1);
            } else {
                oddCounts.put(str.charAt(index), oddCounts.getOrDefault(str.charAt(index), 0) + 1);
            }
        }
        Map<Character, Integer> additionalEvenCounts = new HashMap<>();
        Map<Character, Integer> additionalOddCounts = new HashMap<>();
        int maxEven = 0;
        int maxOdd = 0;

        for (int count : evenCounts.values()) {
            maxEven = Math.max(maxEven, count);
        }

        for (int count : oddCounts.values()) {
            maxOdd = Math.max(maxOdd, count);
        }

        minOperations = Math.min(minOperations, (totalLength / 2 - maxEven) + (totalLength / 2 - maxOdd));

        for (int index = totalLength - 2; index >= 0; index--) {
            if (index % 2 == 0) {
                evenCounts.put(str.charAt(index), evenCounts.get(str.charAt(index)) - 1);
                additionalEvenCounts.put(str.charAt(index + 1), additionalEvenCounts.getOrDefault(str.charAt(index + 1), 0) + 1);
            } else {
                oddCounts.put(str.charAt(index), oddCounts.get(str.charAt(index)) - 1);
                additionalOddCounts.put(str.charAt(index + 1), additionalOddCounts.getOrDefault(str.charAt(index + 1), 0) + 1);
            }

            Map<Character, Integer> combinedEvenCounts = new HashMap<>(evenCounts);
            Map<Character, Integer> combinedOddCounts = new HashMap<>(oddCounts);

            for (Map.Entry<Character, Integer> entry : additionalEvenCounts.entrySet()) {
                combinedEvenCounts.put(entry.getKey(), combinedEvenCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }

            for (Map.Entry<Character, Integer> entry : additionalOddCounts.entrySet()) {
                combinedOddCounts.put(entry.getKey(), combinedOddCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }

            maxEven = 0;
            maxOdd = 0;

            for (int count : combinedEvenCounts.values()) {
                maxEven = Math.max(maxEven, count);
            }

            for (int count : combinedOddCounts.values()) {
                maxOdd = Math.max(maxOdd, count);
            }

            minOperations = Math.min(minOperations, (totalLength / 2 - maxEven) + (totalLength / 2 - maxOdd));
        }

        return minOperations + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();

        while (numberOfTests-- > 0) {
            int stringLength = scanner.nextInt();
            String inputString = scanner.next();

            if (stringLength % 2 == 0) {
                System.out.println(calculateOpsForEvenLength(stringLength, inputString));
            } else {
                System.out.println(calculateOpsForOddLength(stringLength, inputString));
            }
        }
        scanner.close();
    }
}
