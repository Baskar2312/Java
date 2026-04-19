public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
    int[] nums={10,9,2,5,3,7,101,18};
    int n=nums.length;
    int[] dp=new int[n];
    for(int i=0;i<n;i++){
        dp[i]=1;
    }
    int maxLen=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[j]+1,dp[i]);
            }
        }
        maxLen=Math.max(maxLen,dp[i]);
    }
    System.out.println(maxLen);
    }
}
