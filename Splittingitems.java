import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Splittingitems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();

        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        Collections.sort(a, Collections.reverseOrder());

        for (int i = 0; i < n - 1; i++) {
            if (k == 0) {
                break;
            }
            long diff = a.get(i) - a.get(i + 1);
            long r = Math.min(diff, k);
            a.set(i + 1, a.get(i + 1) + r);
            k -= r;
            i++;
        }

        long oddIndexSum = 0;
        long evenIndexSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenIndexSum += a.get(i);
            } else {
                oddIndexSum += a.get(i);
            }
        }

        System.out.println(Math.abs(oddIndexSum - evenIndexSum));
    }
}