import java.util.Scanner;

public class AndReconstruction {

    public static int[][] valid(int numTests, int[][][] testCases) {
        int[][] results = new int[numTests][];

        for (int t = 0; t < numTests; t++) {
            int sz = testCases[t][0][0];
            int[] arrInputed = testCases[t][1];
            
            int[] resultArray = new int[sz];
            resultArray[0] = arrInputed[0];
            boolean isValid = true;

            for (int i = 1; i < sz - 1; i++) {
                resultArray[i] = arrInputed[i - 1] | arrInputed[i];
                if ((resultArray[i - 1] & resultArray[i]) != arrInputed[i - 1]) {
                    isValid = false;
                    break;
                }
            }

            resultArray[sz - 1] = arrInputed[sz - 2];
            if (isValid && (resultArray[sz - 2] & resultArray[sz - 1]) != arrInputed[sz - 2]) {
                isValid = false;
            }

            if (isValid) {
                results[t] = resultArray;
            } else {
                results[t] = new int[]{-1};
            }
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();
        int[][][] testCases = new int[numTests][2][];

        for (int i = 0; i < numTests; i++) {
            int sz = sc.nextInt();
            testCases[i][0] = new int[]{sz};
            int[] arrInputed = new int[sz - 1];
            for (int j = 0; j < sz - 1; j++) {
                arrInputed[j] = sc.nextInt();
            }
            testCases[i][1] = arrInputed;
        }

        int[][] results = valid(numTests, testCases);

        for (int[] result : results) {
            if (result.length == 1 && result[0] == -1) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + (i < result.length - 1 ? " " : "\n" ));
                }
            }
        }
    }   
}
