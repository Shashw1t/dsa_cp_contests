import java.util.*;
public class Robinhelps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt(); 
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int curr = 0;
            int count = 0; 

            for (int j=0; j<n; j++) {
                if (a[j] >= k) {
                    curr += a[j];
                } else if (a[j] == 0 && curr>0) {
                    count++;
                    curr--;
                }
            }
            System.out.println(count);
        }
    }
}
