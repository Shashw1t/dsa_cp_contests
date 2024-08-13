import java.util.*;

public class Seatinginabus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int [] array = new int[n];
            boolean [] flag1 = new boolean[n+2];
            boolean flag2 = false;
            for(int i=0;i<n;i++){
                array[i]= sc.nextInt();
            }
            int a = array[0];

            flag1[a]=true;
            for(int i=1;i<n;i++){
                int c = array[i];
                if(flag1[c + 1] || flag1[c - 1]){
                    flag1[c]=true;
                }else{
                    flag2=true;
                    break;
                }
            }
            if(flag2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}