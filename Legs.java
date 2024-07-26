import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  
            results[i] = minAni(n);
        }
        for (int result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
    
    private static int minAni(int n) {
        if (n % 4 == 0) {
            return n / 4;
        } else {
            return n / 4 + 1;
        }
    }
}
