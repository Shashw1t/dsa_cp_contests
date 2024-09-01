import java.util.*;
import java.math.*;

public class SakurakoBox {
    private static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            long[] array = new long[n];
            long summation = 0;

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextLong();
                summation += array[i];
            }

            BigInteger multiplication = BigInteger.ZERO;
            BigInteger modValue = BigInteger.valueOf(MOD);

            for (int i = 0; i < n; i++) {
                summation -= array[i];
                multiplication = multiplication.add(BigInteger.valueOf(array[i]).multiply(BigInteger.valueOf(summation))).mod(modValue);
            }
            long Q = (long) n * (n - 1) / 2 % MOD;
            long inverseOfQ = modInverse(Q, MOD);
            long finalRes = multiplication.multiply(BigInteger.valueOf(inverseOfQ)).mod(modValue).longValue();
            System.out.println(finalRes);
        }
        sc.close();
    }

    private static long modInverse(long value, long mod) {
        long result = 1;
        long power = mod - 2;
        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * value) % mod;
            }
            value = (value * value) % mod;
            power /= 2;
        }
        return result;
    }
}
