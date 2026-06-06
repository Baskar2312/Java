public class UniquePartitions {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countPartitions(n)); // Output: 7
    }
    public static int countPartitions(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: there's one way to partition 0
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[j - i];
            }
        }
        
        return dp[n];
    }
}
