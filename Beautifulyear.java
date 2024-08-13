import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Beautifulyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        y += 1;

        while (true) {
            String num = Integer.toString(y);

            Set<Character> digits = new HashSet<>();
            boolean isBeautiful = true;

            for (char digit : num.toCharArray()) {
                if (digits.contains(digit)) {
                    isBeautiful = false;
                    break;
                }
                digits.add(digit);
            }
            if (isBeautiful) {
                System.out.println(y);
                break;
            }
            y += 1;
        }
    }
}
