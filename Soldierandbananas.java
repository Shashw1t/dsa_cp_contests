import java.util.Scanner;
public class Soldierandbananas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        
        int borrow1 = k * w * (w + 1) / 2;
        int banana = borrow1 - n;

        if(borrow1 <= n){
            System.out.println(0);
        } else{
            System.out.println(banana);
        }
        sc.close();
    }
    
}
