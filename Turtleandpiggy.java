import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Turtleandpiggy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            Collections.sort(arr);
            
            int start = 0;
            int end = n - 1;
            while (start < end) {
                if ((n - (end - start + 1)) % 2 == 0) {
                    start++;
                } else {
                    end--;
                }
            }
            System.out.println(arr.get(start));
        }
        scanner.close();
    }
}
