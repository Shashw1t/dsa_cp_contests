import java.util.*;

public class UpdateQueries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); 
            
            String s = scanner.nextLine();
            int[] ind = new int[m];
            char[] c = new char[m];
            
            for (int i = 0; i < m; i++) {
                ind[i] = scanner.nextInt() - 1; 
            }
            scanner.nextLine();
            
            String chars = scanner.nextLine();
            for (int i = 0; i < m; i++) {
                c[i] = chars.charAt(i);
            }
            
            Pair[] pairs = new Pair[m];
            for (int i = 0; i < m; i++) {
                pairs[i] = new Pair(ind[i], c[i]);
            }
            
            Arrays.sort(pairs, (p1, p2) -> {
                if (p1.index == p2.index) {
                    return Character.compare(p1.character, p2.character);
                }
                return Integer.compare(p1.index, p2.index);
            });
            
            char[] result = s.toCharArray();
            for (Pair pair : pairs) {
                result[pair.index] = pair.character;
            }
            
            System.out.println(new String(result));
        }
        scanner.close();
    }
    static class Pair {
        int index;
        char character;
        
        Pair(int index, char character) {
            this.index = index;
            this.character = character;
        }
    }
}
