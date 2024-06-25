import java.util.Scanner;
public class bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        for(int i=0; i<n; i++){
            String bits = sc.nextLine();
            if(bits.equals("X++") || bits.equals("++X")){
                count++;
            } else if( bits.equals("--X") || bits.equals("X--")){
                count--;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
