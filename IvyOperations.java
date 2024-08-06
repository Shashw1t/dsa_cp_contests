import java.util.Scanner;

public class IvyOperations {

    private static final int N = 200000;
    private static int[] arr = new int[N + 1];
    private static long[] prefixSum = new long[N + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        arr[0] = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                arr[i] = 1 + arr[i / 3];
            } else {
                arr[i] = 1 + arr[i / 3];
            }
        }

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            long ans = arr[l] * 2;
            if (l < r) {
                ans += (prefixSum[r] - prefixSum[l]);
            }
            System.out.println(ans);
        }
        scanner.close()
    }
}
