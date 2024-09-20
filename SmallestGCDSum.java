import java.util.*;
public class SmallestGCDSum {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int g = arr[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, arr[i]);
            }

            for (int i = 0; i < n; i++) {
                arr[i] /= g;
            }
            Arrays.sort(arr);
            int y = arr[0];
            int c = arr[0];
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                list.add(arr[i]);
            }

            while (c > 1) {
                int minGCD = Integer.MAX_VALUE;
                int index = -1;

                for (int i = 0; i < list.size(); i++) {
                    int curr = gcd(c, list.get(i));
                    if (curr < minGCD) {
                        minGCD = curr;
                        index = i;
                    }
                }
                c = minGCD;
                y += c;
                list.remove(index);
            }

            System.out.println((y + list.size()) * g);
        }

    }
}
