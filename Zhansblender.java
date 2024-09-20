import java.util.*;
public class Zhansblender {

    private static long timeCalc(long n,long x,long y) {
        if (n == 0) return 0;
        long loadEverythingTime = (n+ y-1)/y;
        long blendEverythingTime = (n+x-1)/x; 
        
        return Math.max(loadEverythingTime, blendEverythingTime);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            System.out.println(timeCalc(n, x, y));
            t--;
        }
        sc.close();
    }
}
