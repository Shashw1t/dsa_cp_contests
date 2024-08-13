import java.util.Scanner;

public class Rightleftwrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] number = new int[n];
            long[] prefixSumArray = new long[n];

            for (int i = 0; i < n; i++) {
                number[i] = sc.nextInt();
                prefixSumArray[i] = number[i] + (i > 0 ? prefixSumArray[i - 1] : 0);
            }
            char[] v = sc.next().toCharArray();
            long ans = 0;

            for (int i = 0, j = n - 1; i < j;) {
                while (i < j && v[i] != 'L') {
                    i++;
                }
                while (i < j && v[j] != 'R') {
                    j--;
                }
                if (i < j) {
                    ans += (i > 0) ? (prefixSumArray[j] - prefixSumArray[i - 1]) : prefixSumArray[j];
                    v[i] = '.';
                    v[j] = '.';
                    i++;
                    j--;
                }
            }
            System.out.println(ans);
        }
        sc.close()
    }
}
