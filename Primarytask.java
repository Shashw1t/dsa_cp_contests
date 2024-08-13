import java.util.*;

public class Primarytask {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            String str=String.valueOf(a);
            if(a<=10||a==101){
                System.out.println("NO");
                continue;
            }
            if(str.charAt(0)=='1' && str.charAt(1)=='0'){
                if(str.charAt(2)=='0'){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}