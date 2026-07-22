class Solution {
    public static int solve(int nums[], int curr, int dp[]){
        if(curr>=nums.length) return 0;
        if(dp[curr]!=-1) return dp[curr];
        int res = Math.max(nums[curr]+solve(nums,curr+2,dp),solve(nums,curr+1,dp));
        dp[curr] = res;
        return res;
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}