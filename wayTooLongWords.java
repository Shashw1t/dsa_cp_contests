import java.util.Scanner;
public class wayTooLongWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            String word = sc.nextLine();
            if(word.length()>10){
                int middleLength = word.length()-2;
                System.out.println(word.charAt(0) + String.valueOf(middleLength) + word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }
        
        sc.close();

    }
}
