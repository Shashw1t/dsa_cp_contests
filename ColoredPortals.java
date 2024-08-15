import java.util.Scanner;

public class ColoredPortals {
    static final int N = 200010;
    static final int inf = 1000000000;
    static final int PPL = 200010;
    static final int TYPE = 16;
    static int ppl, q;
    static int[] color = new int[PPL];
    static int[][] prev = new int[PPL][TYPE];
    static int[][] next = new int[PPL][TYPE];

    static int getIdx(char c) {
        if (c == 'B') return 0;
        if (c == 'G') return 1;
        if (c == 'R') return 2;
        return 3;
    }

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    static void solve(Scanner sc) {
        ppl = sc.nextInt();
        q = sc.nextInt();

        for (int i = 1; i <= ppl; i++) {
            String s = sc.next();
            color[i] = (1 << getIdx(s.charAt(0))) | (1 << getIdx(s.charAt(1)));
        }

        for (int i = 0; i < TYPE; i++) {
            prev[0][i] = 0;
            next[ppl + 1][i] = 0;
        }

        for (int i = 1; i <= ppl; i++) {
            System.arraycopy(prev[i - 1], 0, prev[i], 0, TYPE);
            prev[i][color[i]] = i;
        }

        for (int i = ppl; i >= 1; i--) {
            System.arraycopy(next[i + 1], 0, next[i], 0, TYPE);
            next[i][color[i]] = i;
        }

        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            if (x == y) {
                System.out.println("0");
                continue;
            }

            if ((color[x] & color[y]) != 0) {
                System.out.println(y - x);
            } else {
                int res = inf;
                for (int i = 0; i < 4; i++) {
                    if ((color[x] & (1 << i)) != 0) {
                        for (int j = 0; j < 4; j++) {
                            if ((color[y] & (1 << j)) != 0) {
                                int mask = (1 << i) | (1 << j);
                                if (prev[x][mask] != 0) res = min(res, abs(x - prev[x][mask]) + abs(y - prev[x][mask]));
                                if (next[x][mask] != 0) res = min(res, abs(next[x][mask] - x) + abs(next[x][mask] - y));
                            }
                        }
                    }
                }
                if (res == inf) res = -1;
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}