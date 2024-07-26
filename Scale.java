import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();

            List<List<Character>> line = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String row = scanner.nextLine();
                List<Character> rowList = new ArrayList<>();
                for (char c : row.toCharArray()) {
                    rowList.add(c);
                }
                line.add(rowList);
            }
            reduceLine(line, n, k);
        }
        scanner.close();
    }

    private static void reduceLine(List<List<Character>> line, int n, int k) {
        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                System.out.print(line.get(i).get(j));
            }
            System.out.println();
        }
    }
}
