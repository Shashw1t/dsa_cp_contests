import java.util.*;
 
public class UploadMoreRAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        sc.nextLine();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans=1;
            n=n-1;
            if(n==0){
                System.out.println(ans);
            }else{
                System.out.println(ans+(n*k));
            }
        }
        sc.close();
    }
}