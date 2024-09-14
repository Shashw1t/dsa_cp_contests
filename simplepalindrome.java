import java.util.*;
public class simplepalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stored = "aeiou";
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(stored.charAt(j%5));
            }
            System.out.println(sb.toString());
        }
    }
}
