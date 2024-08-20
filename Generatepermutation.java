import java.util.Scanner;

public class Generatepermutation {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            
            if (n%2 == 0) {
                System.out.println("-1");
            } else {
                for (int i = n; i >= 1; i -= 2) {
                    System.out.print(i + " ");
                }
                for (int i = n - 1; i >= 1; i -= 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        solve()
    }
}
