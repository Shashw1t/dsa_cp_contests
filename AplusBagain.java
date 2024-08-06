import java.util.Scanner;

public class AplusBagain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 0;
            ans+= n/10;
            n=n%10;
            ans+=n;
            System.out.println(ans);
        }
    }
}