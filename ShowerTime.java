import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowerTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt(); 
            int m = sc.nextInt(); 
            
            List<int[]> timeBeing = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int left = sc.nextInt();
                int right = sc.nextInt();
                timeBeing.add(new int[]{left, right});
            }
            System.out.println(canShower(n, s, m, timeBeing));
        }
        sc.close();
    }
    
    public static String canShower(int n, int s, int m, List<int[]> timeBeing) {
        if (n > 0 && timeBeing.get(0)[0] >= s) {
            return "YES";
        }
        for (int i = 1; i < n; i++) {
            if (timeBeing.get(i)[0] - timeBeing.get(i - 1)[1] >= s) {
                return "YES";
            }
        }
        if (m - timeBeing.get(n - 1)[1] >= s) {
            return "YES";
        }
        return "NO";
    }
}
