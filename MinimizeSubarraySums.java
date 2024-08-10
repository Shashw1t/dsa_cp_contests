import java.util.*;

public class MinimizeSubarraySums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] p = new Integer[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            
            System.out.print(p[n - 1] + " ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println(); 
        }
        
        sc.close();
    }
}
