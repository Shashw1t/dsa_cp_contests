import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        int result = 0;
        for(int i=0; i<a.length(); i++){
            char a1 = a.charAt(i);
            char b1 = b.charAt(i);

            if(a1 < b1){
                result = -1;
                break;
            } else if(a1 > b1){
                result = 1;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
