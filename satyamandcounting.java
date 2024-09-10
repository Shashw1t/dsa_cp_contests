import java.util.Scanner;

public class satyamandcounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int vertical = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (y==1) vertical++;
            }
            System.out.println(vertical*2);
        }
        sc.close();
    }
}
