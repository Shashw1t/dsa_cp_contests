import java.util.*;

public class syed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = true;

            // if (n < 4 && n != 1) {
            //     System.out.println("NO");
            // } else if (n == 1) {
            //     if (s.charAt(0) == '1') {
            //         System.out.println("YES");
            //     } else {
            //         System.out.println("NO");
            //     }
            // } else if (n == 4) {
            //     for (int i = 0; i < n; i++) {
            //         if (s.charAt(i) != '1') {
            //             flag = false;
            //             break;
            //         }
            //     }
            //     System.out.println(flag ? "YES" : "NO");
            // } 
            // else {
                int sqrt = (int) Math.sqrt(n);
                if (sqrt * sqrt != n) {
                    System.out.println("NO");
                    continue;
                }

                for (int i = 0; i < n; i++) {
                    if (i < sqrt || i >= n-sqrt) {
                        if (s.charAt(i) != '1') {
                            flag = false;
                            break;
                        }
                    } else if (i % sqrt == 0 || (i + 1) % sqrt == 0) { // first and last columns of middle rows
                        if (s.charAt(i) != '1') {
                            flag = false;
                            break;
                        }
                    } else {
                        if (s.charAt(i) != '0') {
                            flag = false;
                            break;
                        }
                    }
                }
                System.out.println(flag ? "YES" : "NO");
            // }
        }
    }


}