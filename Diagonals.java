import java.util.Scanner;
public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 

            if (k == 0) {
                System.out.println(0);
                continue;
            } 
            else if (k <= n) {
                System.out.println(1);
                continue;
            } 
            else {
                int finalanswer = 1;
                k -= n;
                int num = n - 1;
                while (k > 0) {
                    finalanswer++;
                    k -= num;
                    if (k > 0) {
                        finalanswer++;
                        k -= num;
                    }
                    num--;
                }
                System.out.println(finalanswer);
            }
        }
        sc.close();
    }
}
