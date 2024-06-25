import java.util.*;

public class UpdateQueries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline after reading t
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading n and m
            
            String s = scanner.nextLine();
            int[] ind = new int[m];
            char[] c = new char[m];
            
            for (int i = 0; i < m; i++) {
                ind[i] = scanner.nextInt() - 1; // convert to 0-based index
            }
            scanner.nextLine(); // Consume newline after reading ind
            
            String chars = scanner.nextLine();
            for (int i = 0; i < m; i++) {
                c[i] = chars.charAt(i);
            }
            
            // Create pairs of (index, character)
            Pair[] pairs = new Pair[m];
            for (int i = 0; i < m; i++) {
                pairs[i] = new Pair(ind[i], c[i]);
            }
            
            // Sort pairs primarily by index, secondarily by character
            Arrays.sort(pairs, (p1, p2) -> {
                if (p1.index == p2.index) {
                    return Character.compare(p1.character, p2.character);
                }
                return Integer.compare(p1.index, p2.index);
            });
            
            // Apply updates to string s
            char[] result = s.toCharArray();
            for (Pair pair : pairs) {
                result[pair.index] = pair.character;
            }
            
            // Print the resulting string after all updates
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
