import java.util.*;

public class MaximizeScore {

    private static long binarySearch(int n, long k, int[] a, int[] b) {
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        Arrays.sort(indices, (i, j) -> Integer.compare(a[j], a[i]));

        int need = (n - 1) / 2 + 1; 
        long low = 0, high = 1_000_000_000_0L;  

        while (low < high) {
            long mid = (low + high + 1) / 2;
            boolean ok = false;

            for (int i : indices) {
                if (b[i] == 1) {
                    if (a[i] + k >= mid) {
                        ok = true;
                    } else {
                        long x = mid - a[i] - k;
                        int rem = need;
                        for (int j : indices) {
                            if (j == i) continue;
                            if (rem == 0) break;
                            if (a[j] >= x) rem--;
                        }
                        if (rem == 0) ok = true;
                    }
                    break;
                }
            }

            for (int i : indices) {
                if (b[i] == 0) {
                    long x = mid - a[i];
                    int rem = need;
                    long sum = 0;
                    for (int j : indices) {
                        if (j == i) continue;
                        if (rem == 0) break;
                        if (a[j] >= x) {
                            rem--;
                        } else if (b[j] == 1) {
                            sum += x - a[j];
                            rem--;
                        }
                    }
                    if (rem == 0 && sum <= k) {
                        ok = true;
                    }
                    break;
                }
            }

            if (ok) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            long result = binarySearch(n, k, a, b);
            output.append(result).append("\n"); 
        }

        System.out.print(output); 
        sc.close()
    }
}
