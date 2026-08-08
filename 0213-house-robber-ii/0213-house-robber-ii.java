class Solution {
    public static int solve(int dp[], int nums[], int i, int n){
        if(i > n) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i] = Math.max(nums[i]+solve(dp,nums,i+2,n),solve(dp,nums,i+1,n));
        return dp[i];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int ans1 = solve(dp1,nums,0,nums.length-2);
        int ans2 = solve(dp2,nums,1,nums.length-1);
        return Math.max(ans1,ans2);
    }
}