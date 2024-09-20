import java.util.*;
public class Battleforsurvive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            long sum = 0;
            ArrayList<Long> arrlist = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                arrlist.add(x);
            }

            for (int i = 0; i < n - 2; i++) {
                sum = sum + arrlist.get(i);
            }

            long last2 = arrlist.get(n-2) -sum;
            long last = arrlist.get(n-1) -last2;
            System.out.println(last);
        }
    }
}