import java.util.*;

public class Gamewithdoors {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();
            if (l > R || L > r) {
                System.out.println("1");
            } else if (l == L && r == R) {
                System.out.println(r - l);
            } else {
                int baina = Math.max(l, L);
                int daina = Math.min(r, R);
                int ans = daina - baina + 2;
                if (l == L) {
                    ans--;
                }
                if (r == R) {
                    ans--;
                }
                System.out.println(ans);
            }
        }

    }
}