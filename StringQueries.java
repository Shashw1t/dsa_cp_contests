import java.util.Scanner;

public class StringQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            scanner.nextLine(); 

            String a = scanner.nextLine();
            String b = scanner.nextLine();

            int[][] Atimes = new int[n + 1][26];
            int[][] Btimes = new int[n + 1][26];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 26; j++) {
                    Atimes[i + 1][j] = Atimes[i][j];
                    Btimes[i + 1][j] = Btimes[i][j];
                }
                Atimes[i + 1][a.charAt(i) - 'a']++;
                Btimes[i + 1][b.charAt(i) - 'a']++;
            }

            while (q-- > 0) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                l--; r--;

                int[] freqA = new int[26];
                int[] freqB = new int[26];
                for (int i = 0; i < 26; i++) {
                    freqA[i] = Atimes[r + 1][i] - Atimes[l][i];
                    freqB[i] = Btimes[r + 1][i] - Btimes[l][i];
                }

                int changes = 0;
                for (int i = 0; i < 26; i++) {
                    changes += Math.abs(freqA[i] - freqB[i]);
                }
                System.out.println(changes / 2);
            }
        }
        scanner.close()
    }
}
