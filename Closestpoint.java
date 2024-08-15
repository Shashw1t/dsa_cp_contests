import java.util.*;
 
public class Closestpoint {
 
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int [] array = new int[n];
            for(int i=0;i<n;i++){
                array[i]= scanner.nextInt();
            }
            if(n>2){
                System.out.println("NO");
            }
            else if(n==2){
                int diff = Math.abs(array[1]-array[0]);
                if(diff>1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}