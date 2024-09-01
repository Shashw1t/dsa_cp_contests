import java.util.*;

public class longestgoodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long maximum = r - l;
            long start = 0;
            long end = 100000; 

            while (start < end) {
                long mid = (start + end + 1) / 2;
                if (mid * (mid + 1) / 2 <= maximum) {
                    start = mid;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(start + 1);
        }
        sc.close();
    }
}
