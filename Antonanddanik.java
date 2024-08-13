import java.util.Scanner;

public class Antonanddanik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int anton = 0;
        int danik = 0;

        for(char c : s.toCharArray()){
            if(c == 'A'){
                anton++;
            } else if(c == 'D'){
                danik++;
            }
        }

        if(anton > danik){
            System.out.println("Anton");
        } else if(danik > anton){
            System.out.println("Danik");
        } else{
            System.out.println("Friendship");
        }
    }
    
}
