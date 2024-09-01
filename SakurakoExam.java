import java.util.Scanner;

public class SakurakoExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            int add = a + (2 * b);

            if (add % 2 == 0) { 
                int target = add / 2;
                if (target % 2 == 0 || a >= 2) { 
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
