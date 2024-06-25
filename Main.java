import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int[] p = new int[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextInt();
            }
            int countValidPairs = 0;
        
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (p[i - 1] * p[j - 1] % (i * j) == 0) {
                        countValidPairs++;
                    }
                }
            }
            System.out.println(countValidPairs);
        }
        scanner.close();
    }
}
