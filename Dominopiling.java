import java.util.*;

public class Dominopiling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int total = (M*N)/2;
        System.out.println(total);
        sc.close();
    }
}
