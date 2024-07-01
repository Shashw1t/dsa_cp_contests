import java.util.Scanner;

public class CatchTheCoin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[][] coins = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            coins[i][0] = scanner.nextInt();
            coins[i][1] = scanner.nextInt();
        }
        
        String[] results = catchTheCoin(n, coins);
        
        for (String result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    public static String[] catchTheCoin(int n, int[][] coins) {
        String[] results = new String[n];
        
        for (int i = 0; i < n; i++) {
            int x = coins[i][0];
            int y = coins[i][1];
            
            int timeToReach = Math.max(Math.abs(x), Math.abs(y));
            
            if (timeToReach <= y) {
                results[i] = "YES";
            } else {
                results[i] = "NO";
            }
        }
        
        return results;
    }
}
