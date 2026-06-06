public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(nums, sum)); // Output: true
    }
    public static boolean isSubsetSum(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        
        // Base case: A sum of 0 can always be achieved with an empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        
        return dp[n][sum];
    }
}
