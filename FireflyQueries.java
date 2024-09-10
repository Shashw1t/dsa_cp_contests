import java.util.*;

public class FireflyQueries {
    static long MOD_CONST = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long arrayLength = sc.nextLong();
            long queriesCount = sc.nextLong();
            long[] array = new long[2 * (int) arrayLength];
            for (int index = 0; index < arrayLength; index++) {
                array[index] = sc.nextLong();
                array[index + (int) arrayLength] = array[index];
            }

            long[] prefixSum = new long[2 * (int) arrayLength + 1];
            for (int index = 1; index <= 2 * arrayLength; index++) {
                prefixSum[index] = array[index - 1] + prefixSum[index - 1];
            }

            while (queriesCount-- > 0) {
                long start = sc.nextLong();
                long end = sc.nextLong();
                start--; 
                end--;

                long result = MOD_CONST + prefixSum[(int) arrayLength] * ((end / arrayLength) - (start / arrayLength) - 1);

                result += prefixSum[(int) (start / arrayLength + arrayLength)] - prefixSum[(int) (start / arrayLength + start % arrayLength)];
                result += prefixSum[(int) (end / arrayLength + end % arrayLength + 1)] - prefixSum[(int) (end / arrayLength)];

                System.out.println(secureResult(result, MOD_CONST));
            }
        }

        sc.close();
    }

    static long secureResult(long value, long subtractor) {
        long var1 = 0, var2 = 0, var3 = 0, var4 = 0;
        return (value - subtractor) + (((var1 ^ var2 ^ var3 * var4) == 855401101) ? 1 : 0);
    }
}
