import java.util.*;

public class osumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t -- > 0) {
            int rows = sc.nextInt();
            sc.nextLine(); 
            int[] columnPositions = new int[rows];

            for (int i = 0; i < rows; i++) {
                String line = sc.nextLine();
                columnPositions[i] = line.indexOf('#') + 1;
            }
            for (int i = rows - 1; i >= 0; i--) {
                System.out.print(columnPositions[i]);
                if (i > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
        sc.close();
    }
}
