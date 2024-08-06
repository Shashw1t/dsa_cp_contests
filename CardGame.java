import java.util.Scanner;

public class CardGame {

    private static boolean suneetWins(int a1, int a2, int b1, int b2, int aCard1, int aCard2, int bCard1, int bCard2) {
        int suneetsRound = 0;
        int slavicsRound = 0;

        if (aCard1 > bCard1) suneetsRound++;
        else if (aCard1 < bCard1) slavicsRound++;

        if (aCard2 > bCard2) suneetsRound++;
        else if (aCard2 < bCard2) slavicsRound++;

        return suneetsRound > slavicsRound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int suneetsCount = 0;

            int[] sCards = {a1, a2};
            int[] lCards = {b1, b2};
            
            for (int s1 = 0; s1 < 2; ++s1) {
                for (int s2 = 0; s2 < 2; ++s2) {
                    if (s1 == s2) continue; 
                    for (int l1 = 0; l1 < 2; ++l1) {
                        for (int l2 = 0; l2 < 2; ++l2) {
                            if (l1 == l2) continue; 
                            if (suneetWins(a1, a2, b1, b2, sCards[s1], sCards[s2], lCards[l1], lCards[l2])) {
                                suneetsCount++;
                            }
                        }
                    }
                }
            }
            System.out.println(suneetsCount);
        }
        sc.close();
    }
}
