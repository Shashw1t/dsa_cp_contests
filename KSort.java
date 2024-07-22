import java.util.*;

public class KSort {

    public static long calculateMinimumCoins(List<Long> v) {
        List<Long> b = new ArrayList<>();
        long x = v.get(0);
        for (long val : v) {
            x = Math.max(x, val);
            if (x > val) {
                b.add(x - val)
            }
        }
        if (b.isEmpty()) {
            return 0;
        }
        Collections.sort(b);
        long ans = b.get(b.size() - 1), y = 0;
        for (int i = 0; i < b.size(); ++i) {
            ans += (b.get(i) - y) * (b.size() - i);
            y = b.get(i);
        }
        return ans;
    }

    public static void processTestCases() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> v = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                v.add(sc.nextLong());
            }
            long result = calculateMinimumCoins(v);
            System.out.println(result);
        }
        sc.close();
    }

    public static void main(String[] args) {
        processTestCases();
    }
}
