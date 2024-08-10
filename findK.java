import java.util.*;

public class findK {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            int k = sc.nextInt();

            if(k%2!=0){
                System.out.println(one+" "+two);
                k--;
            }


            k/=2;
            for(int i=0;i<k;i++){
                int onec = one+i+1;
                int twoc = two+i+1;
                System.out.println(onec+" "+twoc);
            }
            for(int i=0;i<k;i++){
                int onec = one-i-1;
                int twoc = two-i-1;
                System.out.println(onec+" "+twoc);
            }
        }
    }
}