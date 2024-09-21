import java.util.*;
public class MajorOak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long base = Math.max(1, n-k+1);
            long formula = n*(n+1)/2; 
            long exclude = (base-1) * base/2;
            
            formula -= exclude;

            if (formula%2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
