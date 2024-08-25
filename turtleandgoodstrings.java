import java.util.*;
 
public class turtleandgoodstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();  
            String str = scanner.nextLine();
            
            if (str.charAt(0) != str.charAt(n - 1)) {
                System.out.println("YES");
            } else if (str.charAt(0) == str.charAt(n - 1)) {
                System.out.println("NO");
            }
        }
    }
}