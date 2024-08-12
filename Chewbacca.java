import java.util.*;

public class Chewbacca{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < x.length(); i++){
            int digit = x.charAt(i) - '0';
            int invDigit = 9 - digit;

            if(i==0 && invDigit ==0){
                sb.append(digit);
            } else{
                sb.append(Math.min(invDigit, digit));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}