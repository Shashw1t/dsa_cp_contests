import java.util.*;
public class Roberthoodandmrshood {
    public static void main(String[] args) {
        Scanner nigga = new Scanner(System.in);
        int t = nigga.nextInt();

        while (t-- > 0) {
            long n = nigga.nextLong();
            long d = nigga.nextLong();
            long k = nigga.nextLong();
            
            Map<Long, Long> start = new HashMap<>();
            Map<Long, Long> end = new HashMap<>();

            for (long i=0; i<k; i++) {
                long l = nigga.nextLong();
                long r = nigga.nextLong();
                start.put(l, start.getOrDefault(l, 0L) + 1);
                end.put(r, end.getOrDefault(r, 0L) + 1);
            }
            long bhai = 0;
            long bhaiindex = 1;
            long auntie = 0;
            long auntieindex = 1;
            long overlap = 0;

            for(long i=1; i<=d; i++) {
                overlap += start.getOrDefault(i, 0L);
            }
            auntie=overlap;
            bhai=overlap;

            for(long i=2; i<=n-d+1; i++) {
                overlap = overlap + start.getOrDefault(i+d-1, 0L);
                overlap = overlap - end.getOrDefault(i-1, 0L);

                if(auntie>overlap) {
                    auntie = overlap;
                    auntieindex = i;
                }
                if(overlap>bhai) {
                    bhai = overlap;
                    bhaiindex = i;
                }
            }
            System.out.println(bhaiindex+ " " +auntieindex);
        }
    }
}
