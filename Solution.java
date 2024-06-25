class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            long sum = (long) left * left + (long) right * right; // Use long to avoid overflow
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int c = 2147483600;
        System.out.println(solution.judgeSquareSum(c)); // Expected output: true or false
    }
}
