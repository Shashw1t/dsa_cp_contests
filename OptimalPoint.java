import java.util.Scanner;
import java.util.Arrays;

public class OptimalPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int[] points = new int[3];
            points[0] = scanner.nextInt();
            points[1] = scanner.nextInt();
            points[2] = scanner.nextInt();
            
            Arrays.sort(points);
            int median = points[1];
            
            int totalDistance = Math.abs(points[0] - median) +
                                Math.abs(points[1] - median) +
                                Math.abs(points[2] - median);
            
            System.out.println(totalDistance);
        }
        
        scanner.close();
    }
}
