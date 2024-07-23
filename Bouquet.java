import java.util.*;

public class Bouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            long n = sc.nextLong(); 
            long m = sc.nextLong();

            long[] petalsInitial = new long[(int) n];
            for (int i = 0; i < n; ++i) {
                petalsInitial[i] = sc.nextLong();
            }

            Arrays.sort(petalsInitial);

            long maximumPetals = 0;
            long currPetals = 0;
            long currCost = 0;
            int start = 0;

            for (int end = 0; end < n; ++end) {
                currPetals += petalsInitial[end];
                currCost += petalsInitial[end];

                while (start <= end && (currCost > m || (petalsInitial[end] - petalsInitial[start] > 1))) {
                    currPetals -= petalsInitial[start];
                    currCost -= petalsInitial[start];
                    ++start;
                }

                if (currCost <= m) {
                    maximumPetals = Math.max(maximumPetals, currPetals);
                }
            }
            System.out.println(maximumPetals);
        }
        sc.close();
    }
}
