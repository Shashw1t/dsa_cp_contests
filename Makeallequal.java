import java.util.Scanner;

public class Makeallequal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int minoperations = 0;
        int[] cyclicarray = new int[105];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            cyclicarray[x]++;
            minoperations = Math.max(minoperations, cyclicarray[x]); 
        }
        System.out.println(n - minoperations);
    }
}
