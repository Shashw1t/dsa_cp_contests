import java.util.*;
public class robinhoodintown {
    public static void main(String[] args) {
        Scanner nigga = new Scanner(System.in);
        int t = nigga.nextInt();

        while (t-- > 0) {
            long n = nigga.nextLong();
            long add = 0;
            long[] a = new long[(int)n];
            for (int i=0; i<n; i++) {
                a[i]= nigga.nextLong();
                add += a[i];
            }

            Arrays.sort(a);
            long medianbruh = a[(int)(n / 2)];
            long x = medianbruh * (2 * n) - add + 1;

            if (n <= 2) {
                System.out.println(-1);
            } else {
                if (x < 0) {
                    System.out.println(0);
                } else {
                    System.out.println(x);
                }
            }
        }
    }
}