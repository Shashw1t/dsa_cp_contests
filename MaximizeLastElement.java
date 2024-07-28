import java.util.*;

public class MaximizeLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int maxOddIndexValue = Integer.MIN_VALUE;
            for (int i = 0; i < n; i += 2) {
                if (arr[i] > maxOddIndexValue) {
                    maxOddIndexValue = arr[i];
                }
            }
            System.out.println(maxOddIndexValue);
        }
    }
}
