import java.util.Scanner;

public class minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int output = b-a;
            System.out.println(output);
        }
        sc.close();
    }
}
