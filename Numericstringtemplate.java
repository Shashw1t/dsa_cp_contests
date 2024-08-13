import java.util.*;

public class Numericstringtemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < m; i++) {
                String shashwat = sc.nextLine();
                if (shashwat.length() != n) {
                    System.out.println("NO");
                    continue;
                }
                boolean ff = true;
                Map<Character, Integer> hashmap1 = new HashMap<>();
                Map<Integer, Character> hashmap2 = new HashMap<>();

                for (int j = 0; j < n; j++) {
                    char c = shashwat.charAt(j);

                    if (hashmap1.containsKey(c) && hashmap1.get(c) != a[j]) {
                        ff = false;
                        break;
                    }
                    if (hashmap2.containsKey(a[j]) && hashmap2.get(a[j]) != c) {
                        ff = false;
                        break;
                    }
                    hashmap1.put(c, a[j]);
                    hashmap2.put(a[j], c);
                }

                if (ff) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
