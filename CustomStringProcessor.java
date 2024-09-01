import java.util.*;

public class CustomStringProcessor {

    // Function to calculate the number of zeros in a sequence
    private static int calculateZeros(int index, String sequence, long[] nextIndices, int[] result) {
        if (result[index] != -1) return result[index];
        
        int zeroCount = 0;
        int currentIndex = index;
        List<Integer> tempIndices = new ArrayList<>();
        
        while (result[currentIndex] == -1) {
            tempIndices.add(currentIndex);
            result[currentIndex] = 0;
            if (sequence.charAt(currentIndex) == '0') zeroCount++;
            currentIndex = (int) nextIndices[currentIndex];
            
            // Check for out-of-bounds access
            if (currentIndex < 0 || currentIndex >= nextIndices.length) {
                throw new IndexOutOfBoundsException("Index out of bounds while traversing: " + currentIndex);
            }
        }
        
        if (result[currentIndex] > 0) zeroCount += result[currentIndex];
        
        for (int tempIndex : tempIndices) {
            result[tempIndex] = zeroCount;
        }
        
        return zeroCount;
    }

    // Main function to process the input and output the results
    private static void processInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        long[] nextIndices = new long[size];
        for (int i = 0; i < size; i++) {
            long inputIndex = scanner.nextLong() - 1;
            
            // Check if the index is within bounds
            if (inputIndex < 0 || inputIndex >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds while reading input: " + inputIndex);
            }
            
            nextIndices[i] = inputIndex;
        }
        
        String sequence = scanner.next();
        

        if (sequence.length() != size) {
            throw new IllegalArgumentException("Sequence length does not match the size: expected " + size + ", but got " + sequence.length());
        }
        
        int[] result = new int[size];
        Arrays.fill(result, -1);
        
        for (int i = 0; i < size; i++) {
            if (result[i] == -1) {
                calculateZeros(i, sequence, nextIndices, result);
            }
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        scanner.close();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            processInput();
        }
        scanner.close();
    }
}
