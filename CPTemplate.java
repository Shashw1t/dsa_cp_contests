import java.io.*;
import java.util.*;
 
public class CPTemplate {
    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            solve();
        }
        out.flush();
    }
 
    static long modInverse(long A, long M) {
        long m0 = M;
        long y = 0, x = 1;
 
        if (M == 1)
            return 0;
 
        while (A > 1) {
            long q = A / M;
            long t = M;
 
            M = A % M;
            A = t;
            t = y;
 
            y = x - q * y;
            x = t;
        }
 
        if (x < 0)
            x += m0;
 
        return x;
    }
 
    static void solve() {
        int mod = (int)(1e9 + 7);
        int n = in.nextInt();
        long[] arr = readLongArray(n);
        long[] prefix = new long[n];
        Arrays.sort(arr);
 
        // Correctly build prefix sum array
        prefix[n-1] = arr[n-1] % mod;
        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = (prefix[i + 1] + arr[i]) % mod;
        }
 
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = (ans + (arr[i] * prefix[i + 1]) % mod) % mod;
        }
 
        long div = (n * (n - 1L) / 2) % mod;
        long q = modInverse(div, mod);
 
        out.println((ans * q) % mod);
    }
 
    static long[] readLongArray(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextLong();
        return arr;
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
