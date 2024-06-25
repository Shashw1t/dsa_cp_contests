import java.util.Scanner;

public class MatrixStabilization {
    private static boolean isStrictlyGreater(int[][] matrix, int i, int j, int n, int m) {
        int[] dx = {-1, 1, 0, 0}; 
        int[] dy = {0, 0, -1, 1}; 
        
        int value = matrix[i][j];
        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            if (ni >= 0 && ni < n && nj >= 0 && nj < m && matrix[ni][nj] >= value) {
                return false;
            }
        }
        return true;
    }

    private static void stabilizeMatrix(int[][] matrix, int n, int m) {
        boolean found;
        do {
            found = false;
            outerLoop:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (isStrictlyGreater(matrix, i, j, n, m)) {
                        matrix[i][j]--;
                        found = true;
                        break outerLoop; 
                    }
                }
            }
        } while (found);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            
            stabilizeMatrix(matrix, n, m);
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
